import java.util.*;
 
class Main
{public static void main(String[] args)
{
     
    /*********************
    *             8
    *           / / \ \
    *          3 26 44 89
    *          / \   | / | \
    *         68 78  3 4 9 7
    *********************************/
    Node rr = GenTree(8);
    (rr.kiddo).add(GenTree(3));
    (rr.kiddo).add(GenTree(26));
    (rr.kiddo).add(GenTree(44));
    (rr.kiddo).add(GenTree(89));
    (rr.kiddo.get(0).kiddo).add(GenTree(68));
    (rr.kiddo.get(0).kiddo).add(GenTree(78));
    (rr.kiddo.get(2).kiddo).add(GenTree(3));
    (rr.kiddo.get(3).kiddo).add(GenTree(4));
    (rr.kiddo.get(3).kiddo).add(GenTree(9));
    (rr.kiddo.get(3).kiddo).add(GenTree(7));
 
    System.out.print("transversal!!!!!!!!!!!!!!!!!     ");
    System.out.println();
    LevelOrderTraversal(rr);
}
/*************

Creating the levels and instantiating the 
root hence rr and then 
creating a queue with Linked List Generic Array 

************/
 
static void LevelOrderTraversal(Node rr)
{
    if (rr == null)
        return;
 
    
    Queue<Node > q = new LinkedList<>(); 
    q.add(rr); 
    while (!q.isEmpty())
    {
        int n = q.size();
 

 /*************8
kiddo is the child and it does enqueue and 
dequeus it while doing peek and removing it

 ******************/
        while (n > 0)
        {

            Node p = q.peek();
            q.remove();
            System.out.print(p.pointerk + " ");

            for (int i = 0; i < p.kiddo.size(); i++)
                q.add(p.kiddo.get(i));
            n--;
        }
         
        System.out.println();
    }
}
 /*************

Node class wil creae the node to move 
to create general tree

creates new tree and way to go through
and add elements
 **************/

static Node GenTree(int pointerk)
{
    Node count = new Node();
    count.pointerk = pointerk;
    return count;
}
static class Node
{
    int pointerk;
    Vector<Node >kiddo = new Vector<>();
};
 

 

}