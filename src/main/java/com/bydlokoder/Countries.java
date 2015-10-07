package com.bydlokoder;

public enum Countries {
    Argentina(143505, "Argentina"),
    Australia(143460, "Australia"),
    Belgium(143446, "Belgium"),
    Brazil(143503, "Brazil"),
    Canada(143455, "Canada"),
    Chile(143483, "Chile"),
    China(143465, "China"),
    Colombia(143501, "Colombia"),
    CostaRica(143495, "Costa Rica"),
    Croatia(143494, "Croatia"),
    CzechRepublic(143489, "Czech Republic"),
    Denmark(143458, "Denmark"),
    Deutschland(143443, "Deutschland"),
    ElSalvador(143506, "El Salvador"),
    Espana(143454, "Espana"),
    Finland(143447, "Finland"),
    France(143442, "France"),
    Greece(143448, "Greece"),
    Guatemala(143504, "Guatemala"),
    HongKong(143463, "Hong Kong"),
    Hungary(143482, "Hungary"),
    India(143467, "India"),
    Indonesia(143476, "Indonesia"),
    Ireland(143449, "Ireland"),
    Israel(143491, "Israel"),
    Italia(143450, "Italia"),
    Korea(143466, "Korea"),
    Kuwait(143493, "Kuwait"),
    Lebanon(143497, "Lebanon"),
    Luxembourg(143451, "Luxembourg"),
    Malaysia(143473, "Malaysia"),
    Mexico(143468, "Mexico"),
    Nederland(143452, "Nederland"),
    NewZealand(143461, "New Zealand"),
    Norway(143457, "Norway"),
    Osterreich(143445, "Osterreich"),
    Pakistan(143477, "Pakistan"),
    Panama(143485, "Panama"),
    Peru(143507, "Peru"),
    Phillipines(143474, "Phillipines"),
    Poland(143478, "Poland"),
    Portugal(143453, "Portugal"),
    Qatar(143498, "Qatar"),
    Romania(143487, "Romania"),
    Russia(143469, "Russia"),
    SaudiArabia(143479, "Saudi Arabia"),
    SchweizSuisse(143459, "Schweiz/Suisse"),
    Singapore(143464, "Singapore"),
    Slovakia(143496, "Slovakia"),
    Slovenia(143499, "Slovenia"),
    SouthAfrica(143472, "South Africa"),
    SriLanka(143486, "Sri Lanka"),
    Sweden(143456, "Sweden"),
    Taiwan(143470, "Taiwan"),
    Thailand(143475, "Thailand"),
    Turkey(143480, "Turkey"),
    UnitedArabEmirates(143481, "United Arab Emirates"),
    UnitedKingdom(143444, "United Kingdom"),
    UnitedStates(143441, "United States"),
    Venezuela(143502, "Venezuela"),
    Vietnam(143471, "Vietnam"),
    Japan(143462, "Japan"),
    DominicanRepublic(143508, "Dominican Republic"),
    Ecuador(143509, "Ecuador"),
    Egypt(143516, "Egypt"),
    Estonia(143518, "Estonia"),
    Honduras(143510, "Honduras"),
    Jamaica(143511, "Jamaica"),
    Kazakhstan(143517, "Kazakhstan"),
    Latvia(143519, "Latvia"),
    Lithuania(143520, "Lithuania"),
    Macau(143515, "Macau"),
    Malta(143521, "Malta"),
    Moldova(143523, "Moldova"),
    Nicaragua(143512, "Nicaragua"),
    Paraguay(143513, "Paraguay"),
    Uruguay(143514, "Uruguay");

    Countries(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
