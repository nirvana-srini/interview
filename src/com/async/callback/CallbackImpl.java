package com.async.callback;

public class CallbackImpl implements callback{
    @Override
    public void onSuccess() {
        System.out.println("On Success!!");
    }

    @Override
    public void onFailure(String error) {
        System.out.println("On Failure");
    }
}
