package com.css.practical;

public class Link {
        public int iData; // data item (key)
        public double dData; // data item
        public Link next; // next link in list
// ------------------------------------------------------------

    public Link(long dd) // constructor
    { dData = dd; }

    public Link(int id, double dd) // constructor
    {
        iData = id; // initialize data
        dData = dd; // (‘next’ is automatically
    } // set to null
    // -------------------------------------------------------------
    public void displayLink() // display
    {
        System.out.print("{" + iData +","+ dData + "}");
    }

}
