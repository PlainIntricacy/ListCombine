/**
 * Write a function that combines two lists by alternatingly
 * taking elements. For example: given the two lists [a,b,c]
 * and [1,2,3], the function should return [a,1,b,2,c,3].
 *
 * @author: todyerutz@plainintricacy.wordpress.com
 */

package Lcomb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first list (elements separated by space):");
        List<String> first = new ArrayList<String>();
        String[] parts = input.nextLine().split(" ");
        for(int i=0; i<parts.length; i++){
            first.add(parts[i]);
        }
        System.out.println("Please enter the second list (elements separated by space):");
        List<String> second = new ArrayList<String>();
        parts = input.nextLine().split(" ");
        for(int i=0; i<parts.length; i++){
            second.add(parts[i]);
        }
        Lcomb(first, second);
    }

    public static void Lcomb(List<String> a, List<String> b){
        List<String> result = new ArrayList<String>();
        int max=0;
        if(a.size()>b.size()){
            max=a.size();
        }else{
            max=b.size();
        }
        for(int i=0; i<max; i++){
            if(i<a.size()){
                result.add(a.get(i));
            }
            if(i<b.size()){
                result.add(b.get(i));
            }
        }
        for(String i:result){
            System.out.print(i + " ");
        }
    }
}
