package com.teachMeSkills.an15.PilyushinYuri.hw5;

public class Wine {
    public static class Wine {
        String name;
        String type;
        String country;
        String year;
        String description;

        public Wine (String name, String type, String country, String year, String description) {
            this.name = name;
            this.type = type;
            this.country = country;
            this.year = year;
            this.description = description;






        }

        public Wine() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            com.teachMeSkills.an15.PilyushinYuri.hw5.Wine wine = (com.teachMeSkills.an15.PilyushinYuri.hw5.Wine) o;
            return year == wine.year && Objects.equals(name, wine.name) && Objects.equals(type, wine.type) && Objects.equals(country, wine.country) && Objects.equals(description, wine.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, type, country, year, description);
        }

        @Override
        public String toString() {
            return "Wine{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", country='" + country + '\'' +
                    ", year=" + year +
                    ", description='" + description + '\'' +
                    '}';
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }




    }
}
