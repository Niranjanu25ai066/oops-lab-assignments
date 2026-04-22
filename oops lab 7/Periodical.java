class book{
    int bookId;
    String title;
    String author;
    double price;
     book(int bookId,String title,String author,double price){
        this.bookId= bookId;
        this.title=title;
        this.author=author;
        this.price=price;

     }

     void display()
     {
      System.out.println("BOOK ID "+bookId);
      System.out.println("Title"+title);
      System.out.println("Author"+author);
      System.out.println("price" +price);

  }

}

 class Periodical extends book {
    String Period;

    public Periodical(String Period, int bookId, String title, String author, double price) {
        super(bookId, title, author, price);
        this.Period = Period;
    }

    void modifyDetails(double newPrice,String newPeriod){
        this.price=newPrice;
        this.Period=newPeriod;

    }


    void display(){
        super.display();
        System.out.println("period"  +Period);

    }
    
    public static void main(String[] args) {
        Periodical p=new Periodical("Weekly", 102, "stringVibes", "striker", 5222);

        System.out.println("before modification");
        p.display();

        p.modifyDetails(822, "monthly");
        System.out.println("\nafter modification ");
        p.display();
    }

}
