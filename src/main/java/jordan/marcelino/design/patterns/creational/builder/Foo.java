package jordan.marcelino.design.patterns.creational.builder;

public class Foo {
    private Bar bar;
    private EasierBar easierBar;

    public Foo(Bar bar, EasierBar easierBar) {
        this.bar = bar;
        this.easierBar = easierBar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Bar getBar() {
        return bar;
    }

    public void setEasierBar(EasierBar easierBar) {
        this.easierBar = easierBar;
    }

    public EasierBar getEasierBar() {
        return easierBar;
    }

    public void setBarFromBuilder(String baz) {
        Bar bar = Bar.builder()
                .baz(baz)
                .build();

        this.bar = bar;
    }

    public void setEasierBarFromBuilder(String baz) {
        EasierBar easierBar = EasierBar.builder()
                .easierBaz(baz)
                .build();

        this.easierBar = easierBar;
    }

    public void modifyBarUsingToBuilder(Bar bar) {
        Bar newBar = bar.toBuilder()
                .baz("new baz")
                .build();
    }

    public void modifyEasierBarUsingToBuilder(EasierBar easierBar) {
        EasierBar newEasierBar = easierBar.toBuilder()
                .easierBaz("easier new baz")
                .build();
    }
}
