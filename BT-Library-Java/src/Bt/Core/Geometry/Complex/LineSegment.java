package Bt.Core.Geometry.Complex;

import Bt.Core.Geometry.Elementaries.Point;

public class LineSegment
{
    private Point _a;
    private Point _b;

    public LineSegment(Point aA, Point aB)
    {
        _a = aA;
        _b = aB;
    }
         
    public void shift(double dx, double dy)
    {
        _a.shift(dx, dy);
        _b.shift(dx, dy);
    }
     
    public double length()
    {
        return _a.distance(_b);
    }
    
    public boolean equals(LineSegment aSecond)
    {      
        boolean firstPred = 
            _a.equals(aSecond._a) && _b.equals(aSecond._b);
            
        boolean secondPred = 
            _a.equals(aSecond._b) && _b.equals(aSecond._a);
        
        return firstPred ^ secondPred;
    }

    public String toString()
    {
        return _a+"-"+_b;
    }
}
