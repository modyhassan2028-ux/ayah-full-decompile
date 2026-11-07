package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0808e2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0808e2 f14234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0808e2 f14235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC0808e2[] f14236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0808e2[] f14237v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14238r;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0808e2 EF0;

    static {
        EnumC0877s2 enumC0877s2 = EnumC0877s2.f14400v;
        EnumC0808e2 enumC0808e2 = new EnumC0808e2("DOUBLE", 0, 0, 1, enumC0877s2);
        EnumC0877s2 enumC0877s3 = EnumC0877s2.f14399u;
        EnumC0808e2 enumC0808e3 = new EnumC0808e2("FLOAT", 1, 1, 1, enumC0877s3);
        EnumC0877s2 enumC0877s4 = EnumC0877s2.f14398t;
        EnumC0808e2 enumC0808e4 = new EnumC0808e2("INT64", 2, 2, 1, enumC0877s4);
        EnumC0808e2 enumC0808e5 = new EnumC0808e2("UINT64", 3, 3, 1, enumC0877s4);
        EnumC0877s2 enumC0877s5 = EnumC0877s2.f14397s;
        EnumC0808e2 enumC0808e6 = new EnumC0808e2("INT32", 4, 4, 1, enumC0877s5);
        EnumC0808e2 enumC0808e7 = new EnumC0808e2("FIXED64", 5, 5, 1, enumC0877s4);
        EnumC0808e2 enumC0808e8 = new EnumC0808e2("FIXED32", 6, 6, 1, enumC0877s5);
        EnumC0877s2 enumC0877s6 = EnumC0877s2.f14401w;
        EnumC0808e2 enumC0808e9 = new EnumC0808e2("BOOL", 7, 7, 1, enumC0877s6);
        EnumC0877s2 enumC0877s7 = EnumC0877s2.f14402x;
        EnumC0808e2 enumC0808e10 = new EnumC0808e2("STRING", 8, 8, 1, enumC0877s7);
        EnumC0877s2 enumC0877s8 = EnumC0877s2.f14394A;
        EnumC0808e2 enumC0808e11 = new EnumC0808e2("MESSAGE", 9, 9, 1, enumC0877s8);
        EnumC0877s2 enumC0877s9 = EnumC0877s2.f14403y;
        EnumC0808e2 enumC0808e12 = new EnumC0808e2("BYTES", 10, 10, 1, enumC0877s9);
        EnumC0808e2 enumC0808e13 = new EnumC0808e2("UINT32", 11, 11, 1, enumC0877s5);
        EnumC0877s2 enumC0877s10 = EnumC0877s2.f14404z;
        EnumC0808e2 enumC0808e14 = new EnumC0808e2("ENUM", 12, 12, 1, enumC0877s10);
        EnumC0808e2 enumC0808e15 = new EnumC0808e2("SFIXED32", 13, 13, 1, enumC0877s5);
        EnumC0808e2 enumC0808e16 = new EnumC0808e2("SFIXED64", 14, 14, 1, enumC0877s4);
        EnumC0808e2 enumC0808e17 = new EnumC0808e2("SINT32", 15, 15, 1, enumC0877s5);
        EnumC0808e2 enumC0808e18 = new EnumC0808e2("SINT64", 16, 16, 1, enumC0877s4);
        EnumC0808e2 enumC0808e19 = new EnumC0808e2("GROUP", 17, 17, 1, enumC0877s8);
        EnumC0808e2 enumC0808e20 = new EnumC0808e2("DOUBLE_LIST", 18, 18, 2, enumC0877s2);
        EnumC0808e2 enumC0808e21 = new EnumC0808e2("FLOAT_LIST", 19, 19, 2, enumC0877s3);
        EnumC0808e2 enumC0808e22 = new EnumC0808e2("INT64_LIST", 20, 20, 2, enumC0877s4);
        EnumC0808e2 enumC0808e23 = new EnumC0808e2("UINT64_LIST", 21, 21, 2, enumC0877s4);
        EnumC0808e2 enumC0808e24 = new EnumC0808e2("INT32_LIST", 22, 22, 2, enumC0877s5);
        EnumC0808e2 enumC0808e25 = new EnumC0808e2("FIXED64_LIST", 23, 23, 2, enumC0877s4);
        EnumC0808e2 enumC0808e26 = new EnumC0808e2("FIXED32_LIST", 24, 24, 2, enumC0877s5);
        EnumC0808e2 enumC0808e27 = new EnumC0808e2("BOOL_LIST", 25, 25, 2, enumC0877s6);
        EnumC0808e2 enumC0808e28 = new EnumC0808e2("STRING_LIST", 26, 26, 2, enumC0877s7);
        EnumC0808e2 enumC0808e29 = new EnumC0808e2("MESSAGE_LIST", 27, 27, 2, enumC0877s8);
        EnumC0808e2 enumC0808e30 = new EnumC0808e2("BYTES_LIST", 28, 28, 2, enumC0877s9);
        EnumC0808e2 enumC0808e31 = new EnumC0808e2("UINT32_LIST", 29, 29, 2, enumC0877s5);
        EnumC0808e2 enumC0808e32 = new EnumC0808e2("ENUM_LIST", 30, 30, 2, enumC0877s10);
        EnumC0808e2 enumC0808e33 = new EnumC0808e2("SFIXED32_LIST", 31, 31, 2, enumC0877s5);
        EnumC0808e2 enumC0808e34 = new EnumC0808e2("SFIXED64_LIST", 32, 32, 2, enumC0877s4);
        EnumC0808e2 enumC0808e35 = new EnumC0808e2("SINT32_LIST", 33, 33, 2, enumC0877s5);
        EnumC0808e2 enumC0808e36 = new EnumC0808e2("SINT64_LIST", 34, 34, 2, enumC0877s4);
        EnumC0808e2 enumC0808e37 = new EnumC0808e2("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0877s2);
        f14234s = enumC0808e37;
        EnumC0808e2 enumC0808e38 = new EnumC0808e2("FLOAT_LIST_PACKED", 36, 36, 3, enumC0877s3);
        EnumC0808e2 enumC0808e39 = new EnumC0808e2("INT64_LIST_PACKED", 37, 37, 3, enumC0877s4);
        EnumC0808e2 enumC0808e40 = new EnumC0808e2("UINT64_LIST_PACKED", 38, 38, 3, enumC0877s4);
        EnumC0808e2 enumC0808e41 = new EnumC0808e2("INT32_LIST_PACKED", 39, 39, 3, enumC0877s5);
        EnumC0808e2 enumC0808e42 = new EnumC0808e2("FIXED64_LIST_PACKED", 40, 40, 3, enumC0877s4);
        EnumC0808e2 enumC0808e43 = new EnumC0808e2("FIXED32_LIST_PACKED", 41, 41, 3, enumC0877s5);
        EnumC0808e2 enumC0808e44 = new EnumC0808e2("BOOL_LIST_PACKED", 42, 42, 3, enumC0877s6);
        EnumC0808e2 enumC0808e45 = new EnumC0808e2("UINT32_LIST_PACKED", 43, 43, 3, enumC0877s5);
        EnumC0808e2 enumC0808e46 = new EnumC0808e2("ENUM_LIST_PACKED", 44, 44, 3, enumC0877s10);
        EnumC0808e2 enumC0808e47 = new EnumC0808e2("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0877s5);
        EnumC0808e2 enumC0808e48 = new EnumC0808e2("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0877s4);
        EnumC0808e2 enumC0808e49 = new EnumC0808e2("SINT32_LIST_PACKED", 47, 47, 3, enumC0877s5);
        EnumC0808e2 enumC0808e50 = new EnumC0808e2("SINT64_LIST_PACKED", 48, 48, 3, enumC0877s4);
        f14235t = enumC0808e50;
        f14237v = new EnumC0808e2[]{enumC0808e2, enumC0808e3, enumC0808e4, enumC0808e5, enumC0808e6, enumC0808e7, enumC0808e8, enumC0808e9, enumC0808e10, enumC0808e11, enumC0808e12, enumC0808e13, enumC0808e14, enumC0808e15, enumC0808e16, enumC0808e17, enumC0808e18, enumC0808e19, enumC0808e20, enumC0808e21, enumC0808e22, enumC0808e23, enumC0808e24, enumC0808e25, enumC0808e26, enumC0808e27, enumC0808e28, enumC0808e29, enumC0808e30, enumC0808e31, enumC0808e32, enumC0808e33, enumC0808e34, enumC0808e35, enumC0808e36, enumC0808e37, enumC0808e38, enumC0808e39, enumC0808e40, enumC0808e41, enumC0808e42, enumC0808e43, enumC0808e44, enumC0808e45, enumC0808e46, enumC0808e47, enumC0808e48, enumC0808e49, enumC0808e50, new EnumC0808e2("GROUP_LIST", 49, 49, 2, enumC0877s8), new EnumC0808e2("MAP", 50, 50, 4, EnumC0877s2.f14396r)};
        EnumC0808e2[] enumC0808e2ArrValues = values();
        f14236u = new EnumC0808e2[enumC0808e2ArrValues.length];
        for (EnumC0808e2 enumC0808e51 : enumC0808e2ArrValues) {
            f14236u[enumC0808e51.f14238r] = enumC0808e51;
        }
    }

    public EnumC0808e2(String str, int i10, int i11, int i12, EnumC0877s2 enumC0877s2) {
        super(str, i10);
        this.f14238r = i11;
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            enumC0877s2.getClass();
        }
        if (i12 == 1) {
            EnumC0877s2 enumC0877s3 = EnumC0877s2.f14396r;
            enumC0877s2.ordinal();
        }
    }

    public static EnumC0808e2[] values() {
        return (EnumC0808e2[]) f14237v.clone();
    }
}
