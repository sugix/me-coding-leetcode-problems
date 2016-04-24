public class Vector2D implements Iterator<Integer> {
    
    private Iterator<List<Integer>>outerIterator;
    private Iterator<Integer> innerIterator;

    public Vector2D(List<List<Integer>> vec2d) {
        outerIterator = vec2d.iterator();
        innerIterator = Collections.emptyIterator();
    }

    @Override
    public Integer next() {
       return innerIterator.next(); 
    }

    @Override
    public boolean hasNext() {
        if (innerIterator.hasNext()) {
            return true;
        }
         
        if (!outerIterator.hasNext()) {
            return false;
        }
         
        innerIterator = outerIterator.next().iterator();
         
         
        return hasNext();
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */
