/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    
    private List<Integer> elements = new LinkedList<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        if (   nestedList        == null
        || nestedList.size() == 0)
    {
        return;
    }

    flatten(nestedList, elements);
    }

    @Override
    public Integer next() {
       int ret = -1;
    if (hasNext())
    {
        ret = elements.remove(0);
    }
    return ret; 
    }

    @Override
    public boolean hasNext() {
        return elements.size() > 0;
    }
    
    private void flatten(List<NestedInteger> nestedList, List<Integer> elements)
{
    for (NestedInteger e: nestedList)
    {
        if (e.isInteger())
        {
            elements.add(e.getInteger());
        }
        else
        {
            flatten(e.getList(), elements);
        }
    }
}
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
