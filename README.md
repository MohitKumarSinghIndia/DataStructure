# Data Structures Journey - Mohit Kumar Singh

Welcome to my Data Structures Journey repository! Here, I document my learning progress and share resources, solutions, and insights as I dive deep into various data structures and algorithms.

## About Me

Hi! I'm **Mohit Kumar Singh**, and I'm on a journey to master data structures and algorithms to improve my coding skills and problem-solving abilities. This repository will serve as a log of my progress and will include notes, explanations, and links to useful resources.

You can reach me at:  
📧 **Email**: [Mohitkumarsingh.india@gmail.com](mailto:Mohitkumarsingh.india@gmail.com)

## Progress Tracker

### Completed Topics
- Arrays

### In Progress
- Sorting Algorithms

### Upcoming Topics
- Linked Lists
- Stacks & Queues
- Trees (Binary Trees, Binary Search Trees)
- Heaps
- Graphs
- Graph Algorithms (DFS, BFS)
- Tries
- Advanced Trees (AVL Trees, Red-Black Trees)
- Hash Tables
- Dynamic Programming

## Key Concepts Learned

Some of the core concepts I've learned so far include:
- **Big-O Notation**: Understanding the efficiency of algorithms.
- **Time and Space Complexity**: How to analyze and optimize algorithms.
- **Recursion**: Solving problems by breaking them down into smaller subproblems.
- **Graph Traversals**: Depth-first search (DFS), Breadth-first search (BFS).
- **Dynamic Programming**: Optimizing solutions by storing intermediate results.

## Sorting Algorithms

1. **Bubble Sort**
   - A simple comparison-based sorting algorithm where each element is compared with the next, and they are swapped if out of order. This continues until the array is sorted.
   - **Time Complexity**: O(n²) (Worst and Average), O(n) (Best)

2. **Selection Sort**
   - Repeatedly selects the smallest (or largest) element from the unsorted portion of the array and swaps it with the first unsorted element.
   - **Time Complexity**: O(n²) (Worst, Average, Best)

3. **Insertion Sort**
   - Builds the final sorted array one item at a time by inserting each element into its correct position.
   - **Time Complexity**: O(n²) (Worst, Average), O(n) (Best)

4. **Merge Sort**
   - A divide-and-conquer algorithm that splits the array into halves, sorts each half, and then merges them back together in sorted order.
   - **Time Complexity**: O(n log n) (Worst, Average, Best)

5. **Quick Sort**
   - A divide-and-conquer algorithm that picks a "pivot" element and partitions the array into two sub-arrays—those less than the pivot and those greater than the pivot—before recursively sorting them.
   - **Time Complexity**: O(n log n) (Average), O(n²) (Worst)

6. **Heap Sort**
   - Converts the array into a binary heap structure and repeatedly extracts the maximum element from the heap, placing it at the end of the array.
   - **Time Complexity**: O(n log n) (Worst, Average, Best)

7. **Radix Sort**
   - A non-comparative sorting algorithm that sorts integers digit by digit, starting from the least significant digit (LSD) or most significant digit (MSD).
   - **Time Complexity**: O(nk), where k is the number of digits in the largest number.

8. **Counting Sort**
   - A non-comparative algorithm that counts the occurrences of each element and places them in the correct position based on those counts.
   - **Time Complexity**: O(n + k), where k is the range of the input.

9. **Bucket Sort**
   - Divides the elements into several buckets, sorts each bucket individually (using another sorting algorithm), and then concatenates the results.
   - **Time Complexity**: O(n + k), where k is the number of buckets.

## Searching Algorithms

1. **Linear Search**
   - A simple search algorithm that checks every element in the array until the target element is found or the end of the array is reached.
   - **Time Complexity**: O(n) (Worst, Average, Best)

2. **Binary Search**
   - A more efficient search algorithm that works on sorted arrays. It repeatedly divides the search interval in half and compares the target with the middle element.
   - **Time Complexity**: O(log n) (Worst, Average, Best)

3. **Jump Search**
   - A searching algorithm that works on sorted arrays by jumping ahead by a fixed number of elements and performing linear search within smaller blocks.
   - **Time Complexity**: O(√n) (Worst)

4. **Exponential Search**
   - A search algorithm that works on sorted arrays. It first finds a range where the element could be by exponentially increasing the index and then performs a binary search within that range.
   - **Time Complexity**: O(log n) (Worst)

5. **Interpolation Search**
   - Similar to binary search, but instead of dividing the array in half, it estimates the position of the target based on the value of the target and the elements at the ends of the array.
   - **Time Complexity**: O(log log n) (Best), O(n) (Worst)

6. **Fibonacci Search**
   - A search algorithm that uses Fibonacci numbers to divide the search interval and locate the target element.
   - **Time Complexity**: O(log n) (Worst)

## Contributing

Feel free to contribute to this repo! If you have suggestions, resources, or improvements, feel free to create an issue or open a pull request.
