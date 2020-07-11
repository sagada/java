package com.study.out.iostream;

import java.io.*;

public class IoStreamEx6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("oasd.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(new Board("dddd","eeee"));
        }catch (IOException e)
        {
            e.printStackTrace();

        }


        try{
            FileInputStream fis = new FileInputStream("oasd.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Board board = (Board)ois.readObject();
            System.out.println(board.toString());
        }
        catch (IOException | ClassNotFoundException p)
        {
            p.printStackTrace();
        }
    }
}
class Board implements Serializable
{
    private String title;
    private String content;

    @Override
    public String toString() {
        return "Board{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
