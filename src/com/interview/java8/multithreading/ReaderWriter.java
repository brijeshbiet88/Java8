package com.interview.java8.multithreading;

public class ReaderWriter {

	String lock ;
	int bufferSize ;
	boolean [] buffer ;
	int currentSize = 0;
	int maxReadWrite ;
	int currentReadWrite ;
	public ReaderWriter(int bufferSize) {
		super();
		this.bufferSize = bufferSize;
		buffer = new boolean[bufferSize];
		this.currentSize = 0;
		this.lock = "lock";
		this.maxReadWrite = 18;
		this.currentReadWrite = 0;
	}

	public static void main(String[] args) throws InterruptedException {
		ReaderWriter readerWriter = new ReaderWriter(2);
		
		Thread r1 = new Thread(readerWriter.reader , "Reader-1");
		Thread r2 = new Thread(readerWriter.reader , "Reader-2");
		Thread r3 = new Thread(readerWriter.reader , "Reader-3");
		
		
		Thread w1 = new Thread(readerWriter.writer , "Writer-1");
		Thread w2 = new Thread(readerWriter.writer , "Writer-2");
		Thread w3 = new Thread(readerWriter.writer , "Writer-3");
		
		r1.start();
		r2.start();
		r3.start();
		w1.start();
		w2.start();
		w3.start();
		
		Thread.sleep(2000);
		System.out.println("CurrentReadWrite : "+readerWriter.currentReadWrite);
		
	}
	
	
	Runnable reader = new Runnable() {

		@Override
		public void run() {
			while (maxReadWrite >= currentReadWrite) {
				synchronized (lock) {
					if (currentSize == 0) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							System.out.println("Exception Occured : " + e.getMessage());
						}
					}
					if(maxReadWrite >= currentReadWrite && currentSize > 0) {
						buffer[--currentSize] = false;
						currentReadWrite++;
						System.out.println("Read From Position "+currentSize+" By Thread "+Thread.currentThread().getName());
					}
					lock.notifyAll();
				}
			}
		}
	};
	
	Runnable writer = new Runnable() {

		@Override
		public void run() {
			while (maxReadWrite >= currentReadWrite) {
				synchronized (lock) {
					if (currentSize == buffer.length) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							System.out.println("Exception Occured : " + e.getMessage());
						}
					}
					if(maxReadWrite >= currentReadWrite && currentSize < bufferSize) {
						buffer[currentSize++] = true;
						currentReadWrite++;
						System.out.println("Written to Position "+currentSize+" By Thread "+Thread.currentThread().getName());
					}
					lock.notifyAll();
				}
			}

		}
	};

}
/*
Written to Position 1 By Thread Writer-1
Written to Position 2 By Thread Writer-1
Read From Position 1 By Thread Reader-3
Read From Position 0 By Thread Reader-3
Written to Position 1 By Thread Writer-1
Written to Position 2 By Thread Writer-1
Read From Position 1 By Thread Reader-3
Read From Position 0 By Thread Reader-3
Written to Position 1 By Thread Writer-3
Written to Position 2 By Thread Writer-3
Read From Position 1 By Thread Reader-3
Read From Position 0 By Thread Reader-3
Written to Position 1 By Thread Writer-3
Written to Position 2 By Thread Writer-3
Read From Position 1 By Thread Reader-3
Read From Position 0 By Thread Reader-3
Written to Position 1 By Thread Writer-3
Written to Position 2 By Thread Writer-3
Read From Position 1 By Thread Reader-3
CurrentReadWrite : 19


 */
