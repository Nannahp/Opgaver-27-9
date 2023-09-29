package loanitems;

import javax.print.DocFlavor;

public class LoanItem {
    private String title;

    public LoanItem(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
