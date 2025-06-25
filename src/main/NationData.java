package main;

import java.util.List;

class NationData {
    public String name;
    public String capitalCity;
    public String currency;
    public List<Modifiers> Modifiers;
    public List<Government> Government;
    
    //Getters
    public String getName() {
        return name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public String getCurrency() {
        return currency;
    }

    public List<Modifiers> getModifiers() {
        return Modifiers;
    }

    public List<Government> getGovernment() {
        return Government;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    
    
    //Modifiers
    public static class Modifiers {
        private int politicalfreedom;
        private int governmentspending;
        private int autority;
        private int economy;

        // Getters
        public int getPoliticalfreedom() {
            return politicalfreedom;
        }

        public int getGovernmentspending() {
            return governmentspending;
        }

        public int getAutority() {
            return autority;
        }

        public int getEconomy() {
            return economy;
        }

        public void setPoliticalfreedom(int politicalfreedom) {
            this.politicalfreedom = politicalfreedom;
        }

        public void setGovernmentspending(int governmentspending) {
            this.governmentspending = governmentspending;
        }

        public void setAutority(int autority) {
            this.autority = autority;
        }

        public void setEconomy(int economy) {
            this.economy = economy;
        }
        
        
    }
    
    public static class Government {
        private String ideology;
        private String elections;

        //Getters
        public String getIdeology() {
            return ideology;
        }

        public String getElections() {
            return elections;
        }

        public void setIdeology(String ideology) {
            this.ideology = ideology;
        }

        public void setElections(String elections) {
            this.elections = elections;
        }
        
        
        
    }
}
