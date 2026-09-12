void isHere(String perkName, String[] perks) {
    for (String perk : perks) {
        if (perkName.equals(perk)) {
            System.out.println("Here is a here.");
            return;
        }
    }
    System.out.println("Here is not a here.");

}

void longerForN(int n, String[] perks) {
    int count = 0;
    for (String perk : perks) {
        if (perk.length() > n) {
            count++;
        }
    }
    System.out.println("Слів більше за " + n + " символів: " + count);
}

void main() {
    System.out.println("Hello World!");
    String[] perks = {"two", "koil", "bowl", "zadar", "roma"};
    for (String perk : perks) {
        System.out.println(perk);
    }
    isHere("залізяка", perks);
    isHere("roma", perks);
    longerForN(3, perks);
}