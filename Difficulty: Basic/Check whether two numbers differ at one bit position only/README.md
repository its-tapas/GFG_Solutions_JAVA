<h2><a href="https://www.geeksforgeeks.org/problems/check-whether-two-numbers-differ-at-one-bit-position-only3415/1?page=1&category=Operators,Java-Operators&difficulty=Basic&sortBy=difficulty">Check whether two numbers differ at one bit position only</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:20px">Given two non-negative integers&nbsp;<strong>a</strong>&nbsp;and&nbsp;<strong>b</strong>. The problem is to check whether the two numbers differ at one-bit position only or not. If yes then the answer is 1, otherwise 0.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>a = 13, b = 9
<strong>Output:</strong> 1
<strong>Explanation</strong>: <strong>(13)<sub>10</sub></strong> = (1<strong>1</strong>01)<sub>2</sub>
<strong>(9)<sub>10</sub></strong> = (1<strong>0</strong>01)<sub>2</sub>
Both the numbers differ at one bit 
position only, i.e, differ at the 
<strong>3rd</strong> bit from the right.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: a = 15, b = 8
<strong>Output:</strong> 0
<strong>Explanation</strong>: <strong>(15)<sub>10</sub></strong> = (1<strong>111</strong>)<sub>2</sub> 
<strong>(8)<sub>10</sub></strong> = (1<strong>000</strong>)<sub>2</sub> 
Both the numbers differ at 3 bit
positions.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>DifferOne()</strong>&nbsp;which takes&nbsp;<strong>a, b&nbsp;</strong>as inputs and returns the answer.<br>
<br>
<strong>Expected Time Complexity:</strong>&nbsp;O(max(log a, log b))<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)<br>
<br>
<strong>Constraints:</strong><br>
1 ≤ a, b ≤ 10<sup>9</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>Bit Magic</code>&nbsp;<code>Numbers</code>&nbsp;<code>Operators</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;