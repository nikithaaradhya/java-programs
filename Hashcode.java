package com.company;
import java.io.*;
public class EqualsHashcode {

        public String name;
        public int id;

        EqualsHashcode(String name, int id)
        {

            this.name = name;
            this.id = id;
        }

        @Override
        public boolean equals(Object obj)
        {

            if(this == obj)
                return true;

            if(obj == null || obj.getClass()!= this.getClass())
                return false;
            EqualsHashcode geek = (EqualsHashcode) obj;

            return (geek.name == this.name && geek.id == this.id);
        }

        @Override
        public int hashCode()
        {
            return this.id;
        }

    }
    class Run
    {

        public static void main (String[] args)
        {
            EqualsHashcode g1 = new EqualsHashcode("aa", 1);
            EqualsHashcode g2 = new EqualsHashcode("aa", 1);
            if(g1.hashCode() == g2.hashCode())
            {
                if(g1.equals(g2))
                    System.out.println("Both Objects are equal. ");
                else
                    System.out.println("Both Objects are not equal. ");
            }
            else
                System.out.println("Both Objects are not equal. ");
        }
    }


