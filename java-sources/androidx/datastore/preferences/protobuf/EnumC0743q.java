package androidx.datastore.preferences.protobuf;

import W.AbstractC0607v1;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0743q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0743q f12493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0743q f12494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC0743q[] f12495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0743q[] f12496v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12497r;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0743q EF0;

    static {
        EnumC0751z enumC0751z = EnumC0751z.f12527v;
        EnumC0743q enumC0743q = new EnumC0743q("DOUBLE", 0, 0, 1, enumC0751z);
        EnumC0751z enumC0751z2 = EnumC0751z.f12526u;
        EnumC0743q enumC0743q2 = new EnumC0743q("FLOAT", 1, 1, 1, enumC0751z2);
        EnumC0751z enumC0751z3 = EnumC0751z.f12525t;
        EnumC0743q enumC0743q3 = new EnumC0743q("INT64", 2, 2, 1, enumC0751z3);
        EnumC0743q enumC0743q4 = new EnumC0743q("UINT64", 3, 3, 1, enumC0751z3);
        EnumC0751z enumC0751z4 = EnumC0751z.f12524s;
        EnumC0743q enumC0743q5 = new EnumC0743q("INT32", 4, 4, 1, enumC0751z4);
        EnumC0743q enumC0743q6 = new EnumC0743q("FIXED64", 5, 5, 1, enumC0751z3);
        EnumC0743q enumC0743q7 = new EnumC0743q("FIXED32", 6, 6, 1, enumC0751z4);
        EnumC0751z enumC0751z5 = EnumC0751z.f12528w;
        EnumC0743q enumC0743q8 = new EnumC0743q("BOOL", 7, 7, 1, enumC0751z5);
        EnumC0751z enumC0751z6 = EnumC0751z.f12529x;
        EnumC0743q enumC0743q9 = new EnumC0743q("STRING", 8, 8, 1, enumC0751z6);
        EnumC0751z enumC0751z7 = EnumC0751z.f12521A;
        EnumC0743q enumC0743q10 = new EnumC0743q("MESSAGE", 9, 9, 1, enumC0751z7);
        EnumC0751z enumC0751z8 = EnumC0751z.f12530y;
        EnumC0743q enumC0743q11 = new EnumC0743q("BYTES", 10, 10, 1, enumC0751z8);
        EnumC0743q enumC0743q12 = new EnumC0743q("UINT32", 11, 11, 1, enumC0751z4);
        EnumC0751z enumC0751z9 = EnumC0751z.f12531z;
        EnumC0743q enumC0743q13 = new EnumC0743q("ENUM", 12, 12, 1, enumC0751z9);
        EnumC0743q enumC0743q14 = new EnumC0743q("SFIXED32", 13, 13, 1, enumC0751z4);
        EnumC0743q enumC0743q15 = new EnumC0743q("SFIXED64", 14, 14, 1, enumC0751z3);
        EnumC0743q enumC0743q16 = new EnumC0743q("SINT32", 15, 15, 1, enumC0751z4);
        EnumC0743q enumC0743q17 = new EnumC0743q("SINT64", 16, 16, 1, enumC0751z3);
        EnumC0743q enumC0743q18 = new EnumC0743q("GROUP", 17, 17, 1, enumC0751z7);
        EnumC0743q enumC0743q19 = new EnumC0743q("DOUBLE_LIST", 18, 18, 2, enumC0751z);
        EnumC0743q enumC0743q20 = new EnumC0743q("FLOAT_LIST", 19, 19, 2, enumC0751z2);
        EnumC0743q enumC0743q21 = new EnumC0743q("INT64_LIST", 20, 20, 2, enumC0751z3);
        EnumC0743q enumC0743q22 = new EnumC0743q("UINT64_LIST", 21, 21, 2, enumC0751z3);
        EnumC0743q enumC0743q23 = new EnumC0743q("INT32_LIST", 22, 22, 2, enumC0751z4);
        EnumC0743q enumC0743q24 = new EnumC0743q("FIXED64_LIST", 23, 23, 2, enumC0751z3);
        EnumC0743q enumC0743q25 = new EnumC0743q("FIXED32_LIST", 24, 24, 2, enumC0751z4);
        EnumC0743q enumC0743q26 = new EnumC0743q("BOOL_LIST", 25, 25, 2, enumC0751z5);
        EnumC0743q enumC0743q27 = new EnumC0743q("STRING_LIST", 26, 26, 2, enumC0751z6);
        EnumC0743q enumC0743q28 = new EnumC0743q("MESSAGE_LIST", 27, 27, 2, enumC0751z7);
        EnumC0743q enumC0743q29 = new EnumC0743q("BYTES_LIST", 28, 28, 2, enumC0751z8);
        EnumC0743q enumC0743q30 = new EnumC0743q("UINT32_LIST", 29, 29, 2, enumC0751z4);
        EnumC0743q enumC0743q31 = new EnumC0743q("ENUM_LIST", 30, 30, 2, enumC0751z9);
        EnumC0743q enumC0743q32 = new EnumC0743q("SFIXED32_LIST", 31, 31, 2, enumC0751z4);
        EnumC0743q enumC0743q33 = new EnumC0743q("SFIXED64_LIST", 32, 32, 2, enumC0751z3);
        EnumC0743q enumC0743q34 = new EnumC0743q("SINT32_LIST", 33, 33, 2, enumC0751z4);
        EnumC0743q enumC0743q35 = new EnumC0743q("SINT64_LIST", 34, 34, 2, enumC0751z3);
        EnumC0743q enumC0743q36 = new EnumC0743q("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0751z);
        f12493s = enumC0743q36;
        EnumC0743q enumC0743q37 = new EnumC0743q("FLOAT_LIST_PACKED", 36, 36, 3, enumC0751z2);
        EnumC0743q enumC0743q38 = new EnumC0743q("INT64_LIST_PACKED", 37, 37, 3, enumC0751z3);
        EnumC0743q enumC0743q39 = new EnumC0743q("UINT64_LIST_PACKED", 38, 38, 3, enumC0751z3);
        EnumC0743q enumC0743q40 = new EnumC0743q("INT32_LIST_PACKED", 39, 39, 3, enumC0751z4);
        EnumC0743q enumC0743q41 = new EnumC0743q("FIXED64_LIST_PACKED", 40, 40, 3, enumC0751z3);
        EnumC0743q enumC0743q42 = new EnumC0743q("FIXED32_LIST_PACKED", 41, 41, 3, enumC0751z4);
        EnumC0743q enumC0743q43 = new EnumC0743q("BOOL_LIST_PACKED", 42, 42, 3, enumC0751z5);
        EnumC0743q enumC0743q44 = new EnumC0743q("UINT32_LIST_PACKED", 43, 43, 3, enumC0751z4);
        EnumC0743q enumC0743q45 = new EnumC0743q("ENUM_LIST_PACKED", 44, 44, 3, enumC0751z9);
        EnumC0743q enumC0743q46 = new EnumC0743q("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0751z4);
        EnumC0743q enumC0743q47 = new EnumC0743q("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0751z3);
        EnumC0743q enumC0743q48 = new EnumC0743q("SINT32_LIST_PACKED", 47, 47, 3, enumC0751z4);
        EnumC0743q enumC0743q49 = new EnumC0743q("SINT64_LIST_PACKED", 48, 48, 3, enumC0751z3);
        f12494t = enumC0743q49;
        f12496v = new EnumC0743q[]{enumC0743q, enumC0743q2, enumC0743q3, enumC0743q4, enumC0743q5, enumC0743q6, enumC0743q7, enumC0743q8, enumC0743q9, enumC0743q10, enumC0743q11, enumC0743q12, enumC0743q13, enumC0743q14, enumC0743q15, enumC0743q16, enumC0743q17, enumC0743q18, enumC0743q19, enumC0743q20, enumC0743q21, enumC0743q22, enumC0743q23, enumC0743q24, enumC0743q25, enumC0743q26, enumC0743q27, enumC0743q28, enumC0743q29, enumC0743q30, enumC0743q31, enumC0743q32, enumC0743q33, enumC0743q34, enumC0743q35, enumC0743q36, enumC0743q37, enumC0743q38, enumC0743q39, enumC0743q40, enumC0743q41, enumC0743q42, enumC0743q43, enumC0743q44, enumC0743q45, enumC0743q46, enumC0743q47, enumC0743q48, enumC0743q49, new EnumC0743q("GROUP_LIST", 49, 49, 2, enumC0751z7), new EnumC0743q("MAP", 50, 50, 4, EnumC0751z.f12523r)};
        EnumC0743q[] enumC0743qArrValues = values();
        f12495u = new EnumC0743q[enumC0743qArrValues.length];
        for (EnumC0743q enumC0743q50 : enumC0743qArrValues) {
            f12495u[enumC0743q50.f12497r] = enumC0743q50;
        }
    }

    public EnumC0743q(String str, int i10, int i11, int i12, EnumC0751z enumC0751z) {
        super(str, i10);
        this.f12497r = i11;
        int iB = AbstractC0607v1.b(i12);
        if (iB == 1 || iB == 3) {
            enumC0751z.getClass();
        }
        if (i12 == 1) {
            enumC0751z.ordinal();
        }
    }

    public static EnumC0743q valueOf(String str) {
        return (EnumC0743q) Enum.valueOf(EnumC0743q.class, str);
    }

    public static EnumC0743q[] values() {
        return (EnumC0743q[]) f12496v.clone();
    }
}
