package jordan.marcelino.design.patterns.creational.builder;

public class Bar {
    private String baz;

    public Bar(String baz) {
        this.baz = baz;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public String getBaz() {
        return baz;
    }

    public BarBuilder toBuilder() {
        return new BarBuilder()
                .baz(this.baz);
    }

    public static BarBuilder builder() {
        return new BarBuilder();
    }

    public static class BarBuilder {
        private String baz;

        public BarBuilder baz(String baz) {
            this.baz = baz;

            return this;
        }

        public Bar build() {
            return new Bar(this.baz);
        }
    }
}
