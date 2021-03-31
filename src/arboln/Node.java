
package arboln;

public class Node {
    
    int data, sw;
    Node link, linkList;
    
    //Constructor
    public Node(int d) {
      data = d;
      sw = 0;
      link = null;
      linkList = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public void setLinkList(Node linkList) {
        this.linkList = linkList;
    }

    public int getData() {
        return data;
    }

    public int getSw() {
        return sw;
    }

    public Node getLink() {
        return link;
    }

    public Node getLinkList() {
        return linkList;
    }
}
