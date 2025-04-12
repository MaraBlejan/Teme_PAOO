
public class Burger {
    private String bread;
    private String meat;
    private boolean cheese;
    private boolean lettuce;

    private Burger(Builder builder)
    {
    this.bread=builder.bread;
    this.meat=builder.meat;
    this.cheese=builder.cheese;
    this.lettuce=builder.lettuce;
    }
    public Burger(boolean lettuce)
    {
        this.lettuce=lettuce;
    }

    @Override
    public String toString() {
        return "Burger with " + bread + ", " + meat +
                (cheese ? ", cheese" : "") +
                (lettuce ? ", lettuce" : "");
    }
    public static class Builder {
        private String bread;
        private String meat;
        private boolean cheese;
        private boolean lettuce;

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder addCheese() {
            this.cheese = true;
            return this;
        }

        public Builder addLettuce() {
            this.lettuce = true;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
