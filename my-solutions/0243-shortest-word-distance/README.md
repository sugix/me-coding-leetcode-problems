<p>Given an array of strings <code>wordsDict</code> and two different strings that already exist in the array <code>word1</code> and <code>word2</code>, return <em>the shortest distance between these two words in the list</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> wordsDict = [&quot;practice&quot;, &quot;makes&quot;, &quot;perfect&quot;, &quot;coding&quot;, &quot;makes&quot;], word1 = &quot;coding&quot;, word2 = &quot;practice&quot;
<strong>Output:</strong> 3
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> wordsDict = [&quot;practice&quot;, &quot;makes&quot;, &quot;perfect&quot;, &quot;coding&quot;, &quot;makes&quot;], word1 = &quot;makes&quot;, word2 = &quot;coding&quot;
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= wordsDict.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>1 &lt;= wordsDict[i].length &lt;= 10</code></li>
	<li><code>wordsDict[i]</code> consists of lowercase English letters.</li>
	<li><code>word1</code> and <code>word2</code> are in <code>wordsDict</code>.</li>
	<li><code>word1 != word2</code></li>
</ul>
