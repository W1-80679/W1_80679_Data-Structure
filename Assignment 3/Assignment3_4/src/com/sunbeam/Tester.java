package com.sunbeam;

import java.util.Scanner;

public class Tester 
{
	
	    public static void main(String[] args) 
	    {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the circular queue: ");
	        int size = scanner.nextInt();

	        CircularQueue circularQueue = new CircularQueue(size);

	        int choice;
	        do 
	        
	        {
	            System.out.println("\n1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Display");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) 
	            {
	                case 1:
	                    System.out.print("Enter the value to enqueue: ");
	                    int enqueueValue = scanner.nextInt();
	                    circularQueue.enqueue(enqueueValue);
	                    break;
	                case 2:
	                    circularQueue.dequeue();
	                    break;
	                case 3:
	                    circularQueue.display();
	                    break;
	                case 0:
	                    System.out.println("Exiting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	                    break;
	            }
	        } while (choice != 0);

	        scanner.close();
	    }
	}

