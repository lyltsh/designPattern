package com.design.pattern.command;

public class IInvoker {
    private Command command;

    public IInvoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
