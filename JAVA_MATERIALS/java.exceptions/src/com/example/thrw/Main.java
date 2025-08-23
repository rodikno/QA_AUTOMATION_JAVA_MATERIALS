package com.example.thrw;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            thisMethodThrowsCheckedException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

    }


    public static void thisMethodThrowsCheckedException() throws IOException {
        throw new IOException("HAAHAA EXCEPTION");
    }


}