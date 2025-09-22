# 🎨 Flood Fill (LeetCode 733) – BFS  

## 📖 Problem Statement  
You are given an `image` represented as a 2D grid of integers, where each integer represents a pixel color.  
Starting from a given pixel `(sr, sc)`, you need to **recolor the entire connected region** with a new color.  

Connectivity:  
- A pixel is connected if it shares the **same original color** and is reachable by moving up, down, left, or right.  

Return the modified image after performing flood fill.  

---

## 🌱 Example  

**Input:**  
image = [[1,1,1],
[1,1,0],
[1,0,1]]
sr = 1, sc = 1, color = 2

makefile
Copy code

**Output:**  
[[2,2,2],
[2,2,0],
[2,0,1]]

yaml
Copy code

Both are valid since the connected region of `1`s around `(1,1)` gets recolored to `2`.  

---

## 🔎 Solution Overview  

This problem can be modeled as a **graph traversal**:  
- **Nodes** → pixels in the grid  
- **Edges** → connectivity between up, down, left, right neighbors  

Approach:  
1. Save the original color of `(sr, sc)`  
2. Use **Breadth-First Search (BFS)** to explore all connected pixels  
3. Recolor each connected pixel with the new color  
4. Stop when boundaries or a different color are reached  

---

## ⚡ Complexity Analysis  
- **Time Complexity:** `O(m × n)` → each pixel is visited at most once.  
- **Space Complexity:** `O(m × n)` → queue can store all pixels in the worst case.  

---

## 🌍 Real-World Applications  
Flood Fill is widely used in **System Design** and **Computer Graphics**:  
- 🎨 MS Paint “bucket tool”  
- 🗺️ Detecting islands in a grid  
- 📊 Region labeling in clustering  

---

✍️ *Solved using BFS in Java.*  
