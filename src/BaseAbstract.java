abstract class BaseAbstract {
    private String surName = "Kowalski";

    // Create getter and setter for surName param
    public String getSurName() {
        return surName;
    }

    public void setSurName(String _surName) {
        if(!_surName.isEmpty())
        {
            this.surName = _surName;
        }
    }
}
