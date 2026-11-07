package com.google.android.gms.internal.measurement;

import io.realm.RealmFieldTypeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0874s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14392a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14393b;

    public C0874s(int i10) {
        this.f14393b = i10;
    }

    public static C0845m c(Aa.a aVar, List list) {
        EnumC0894w enumC0894w = EnumC0894w.ADD;
        p185s8.u0.I(2, "FN", list);
        InterfaceC0850n interfaceC0850nC = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) list.get(0));
        InterfaceC0850n interfaceC0850nC2 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) list.get(1));
        if (!(interfaceC0850nC2 instanceof C0800d)) {
            throw new IllegalArgumentException(p123m2.c.s("FN requires an ArrayValue of parameter names found ", interfaceC0850nC2.getClass().getCanonicalName()));
        }
        List listM = ((C0800d) interfaceC0850nC2).m();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C0845m(interfaceC0850nC.h(), (ArrayList) listM, arrayList, aVar);
    }

    public static boolean d(InterfaceC0850n interfaceC0850n, InterfaceC0850n interfaceC0850n2) {
        if (interfaceC0850n instanceof InterfaceC0830j) {
            interfaceC0850n = new C0865q(interfaceC0850n.h());
        }
        if (interfaceC0850n2 instanceof InterfaceC0830j) {
            interfaceC0850n2 = new C0865q(interfaceC0850n2.h());
        }
        if ((interfaceC0850n instanceof C0865q) && (interfaceC0850n2 instanceof C0865q)) {
            return ((C0865q) interfaceC0850n).f14388r.compareTo(((C0865q) interfaceC0850n2).f14388r) < 0;
        }
        double dDoubleValue = interfaceC0850n.b().doubleValue();
        double dDoubleValue2 = interfaceC0850n2.b().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static InterfaceC0850n e(C0889v c0889v, InterfaceC0850n interfaceC0850n, InterfaceC0850n interfaceC0850n2) {
        if (interfaceC0850n instanceof Iterable) {
            return g(c0889v, ((Iterable) interfaceC0850n).iterator(), interfaceC0850n2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(InterfaceC0850n interfaceC0850n, InterfaceC0850n interfaceC0850n2) {
        if (interfaceC0850n.getClass().equals(interfaceC0850n2.getClass())) {
            if ((interfaceC0850n instanceof r) || (interfaceC0850n instanceof C0840l)) {
                return true;
            }
            if (interfaceC0850n instanceof C0815g) {
                return (Double.isNaN(interfaceC0850n.b().doubleValue()) || Double.isNaN(interfaceC0850n2.b().doubleValue()) || interfaceC0850n.b().doubleValue() != interfaceC0850n2.b().doubleValue()) ? false : true;
            }
            if (interfaceC0850n instanceof C0865q) {
                return interfaceC0850n.h().equals(interfaceC0850n2.h());
            }
            if (interfaceC0850n instanceof C0805e) {
                return interfaceC0850n.d().equals(interfaceC0850n2.d());
            }
            return interfaceC0850n == interfaceC0850n2;
        }
        if (((interfaceC0850n instanceof r) || (interfaceC0850n instanceof C0840l)) && ((interfaceC0850n2 instanceof r) || (interfaceC0850n2 instanceof C0840l))) {
            return true;
        }
        boolean z10 = interfaceC0850n instanceof C0815g;
        if (z10 && (interfaceC0850n2 instanceof C0865q)) {
            return f(interfaceC0850n, new C0815g(interfaceC0850n2.b()));
        }
        boolean z11 = interfaceC0850n instanceof C0865q;
        if (z11 && (interfaceC0850n2 instanceof C0815g)) {
            return f(new C0815g(interfaceC0850n.b()), interfaceC0850n2);
        }
        if (interfaceC0850n instanceof C0805e) {
            return f(new C0815g(interfaceC0850n.b()), interfaceC0850n2);
        }
        if (interfaceC0850n2 instanceof C0805e) {
            return f(interfaceC0850n, new C0815g(interfaceC0850n2.b()));
        }
        if ((z11 || z10) && (interfaceC0850n2 instanceof InterfaceC0830j)) {
            return f(interfaceC0850n, new C0865q(interfaceC0850n2.h()));
        }
        if ((interfaceC0850n instanceof InterfaceC0830j) && ((interfaceC0850n2 instanceof C0865q) || (interfaceC0850n2 instanceof C0815g))) {
            return f(new C0865q(interfaceC0850n.h()), interfaceC0850n2);
        }
        return false;
    }

    public static InterfaceC0850n g(C0889v c0889v, Iterator it, InterfaceC0850n interfaceC0850n) {
        Aa.a aVarQ;
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC0850n interfaceC0850n2 = (InterfaceC0850n) it.next();
                switch (c0889v.f14429a) {
                    case 0:
                        aVarQ = c0889v.f14430b.Q();
                        String str = c0889v.f14431c;
                        aVarQ.T(str, interfaceC0850n2);
                        ((HashMap) aVarQ.f557u).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        aVarQ = c0889v.f14430b.Q();
                        aVarQ.T(c0889v.f14431c, interfaceC0850n2);
                        break;
                    default:
                        aVarQ = c0889v.f14430b;
                        aVarQ.T(c0889v.f14431c, interfaceC0850n2);
                        break;
                }
                InterfaceC0850n interfaceC0850nO = aVarQ.O((C0800d) interfaceC0850n);
                if (interfaceC0850nO instanceof C0810f) {
                    C0810f c0810f = (C0810f) interfaceC0850nO;
                    String str2 = c0810f.f14242s;
                    if ("break".equals(str2)) {
                        return InterfaceC0850n.f14367i;
                    }
                    if ("return".equals(str2)) {
                        return c0810f;
                    }
                }
            }
        }
        return InterfaceC0850n.f14367i;
    }

    public static boolean h(InterfaceC0850n interfaceC0850n, InterfaceC0850n interfaceC0850n2) {
        if (interfaceC0850n instanceof InterfaceC0830j) {
            interfaceC0850n = new C0865q(interfaceC0850n.h());
        }
        if (interfaceC0850n2 instanceof InterfaceC0830j) {
            interfaceC0850n2 = new C0865q(interfaceC0850n2.h());
        }
        return (((interfaceC0850n instanceof C0865q) && (interfaceC0850n2 instanceof C0865q)) || !(Double.isNaN(interfaceC0850n.b().doubleValue()) || Double.isNaN(interfaceC0850n2.b().doubleValue()))) && !d(interfaceC0850n2, interfaceC0850n);
    }

    /* JADX WARN: Code duplicated, block: B:304:0x092a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0935  */
    /* JADX WARN: Code duplicated, block: B:309:0x0942  */
    /* JADX WARN: Code duplicated, block: B:499:0x093f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x091a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0949 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0949 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:? A[SYNTHETIC] */
    public final InterfaceC0850n a(String str, Aa.a aVar, ArrayList arrayList) {
        boolean zF;
        boolean zF2;
        InterfaceC0850n interfaceC0850nO;
        C0810f c0810f;
        String str2;
        InterfaceC0850n c0865q;
        InterfaceC0850n interfaceC0850nC;
        InterfaceC0850n interfaceC0850nC2;
        String str3;
        int i10 = 0;
        switch (this.f14393b) {
            case 0:
                EnumC0894w enumC0894w = EnumC0894w.ADD;
                switch (p185s8.u0.L(str).ordinal()) {
                    case 4:
                        p185s8.u0.H(2, "BITWISE_AND", arrayList);
                        return new C0815g(Double.valueOf(p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue()) & p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue())));
                    case 5:
                        p185s8.u0.H(2, "BITWISE_LEFT_SHIFT", arrayList);
                        return new C0815g(Double.valueOf(p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue()) << ((int) (((long) p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue())) & 31))));
                    case 6:
                        p185s8.u0.H(1, "BITWISE_NOT", arrayList);
                        return new C0815g(Double.valueOf(~p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue())));
                    case 7:
                        p185s8.u0.H(2, "BITWISE_OR", arrayList);
                        return new C0815g(Double.valueOf(p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue()) | p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue())));
                    case 8:
                        p185s8.u0.H(2, "BITWISE_RIGHT_SHIFT", arrayList);
                        return new C0815g(Double.valueOf(p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue()) >> ((int) (((long) p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue())) & 31))));
                    case 9:
                        p185s8.u0.H(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                        return new C0815g(Double.valueOf((((long) p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue())) & 4294967295L) >>> ((int) (((long) p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue())) & 31))));
                    case 10:
                        p185s8.u0.H(2, "BITWISE_XOR", arrayList);
                        return new C0815g(Double.valueOf(p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue()) ^ p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                p185s8.u0.H(2, p185s8.u0.L(str).name(), arrayList);
                InterfaceC0850n interfaceC0850nC3 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                InterfaceC0850n interfaceC0850nC4 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1));
                int iOrdinal = p185s8.u0.L(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zF2 = f(interfaceC0850nC3, interfaceC0850nC4);
                    } else if (iOrdinal == 42) {
                        zF = d(interfaceC0850nC3, interfaceC0850nC4);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zF = d(interfaceC0850nC4, interfaceC0850nC3);
                                break;
                            case 38:
                                zF = h(interfaceC0850nC4, interfaceC0850nC3);
                                break;
                            case 39:
                                zF = p185s8.u0.M(interfaceC0850nC3, interfaceC0850nC4);
                                break;
                            case 40:
                                zF2 = p185s8.u0.M(interfaceC0850nC3, interfaceC0850nC4);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        zF = h(interfaceC0850nC3, interfaceC0850nC4);
                    }
                    zF = !zF2;
                } else {
                    zF = f(interfaceC0850nC3, interfaceC0850nC4);
                }
                return zF ? InterfaceC0850n.f14371n : InterfaceC0850n.f14372o;
            case 2:
                EnumC0894w enumC0894w2 = EnumC0894w.ADD;
                int iOrdinal2 = p185s8.u0.L(str).ordinal();
                if (iOrdinal2 == 2) {
                    p185s8.u0.H(3, "APPLY", arrayList);
                    InterfaceC0850n interfaceC0850n = (InterfaceC0850n) arrayList.get(0);
                    C0879t c0879t = (C0879t) aVar.f555s;
                    C0879t c0879t2 = (C0879t) aVar.f555s;
                    InterfaceC0850n interfaceC0850nC5 = c0879t.c(aVar, interfaceC0850n);
                    String strH = c0879t2.c(aVar, (InterfaceC0850n) arrayList.get(1)).h();
                    InterfaceC0850n interfaceC0850nC6 = c0879t2.c(aVar, (InterfaceC0850n) arrayList.get(2));
                    if (!(interfaceC0850nC6 instanceof C0800d)) {
                        throw new IllegalArgumentException(p123m2.c.s("Function arguments for Apply are not a list found ", interfaceC0850nC6.getClass().getCanonicalName()));
                    }
                    if (strH.isEmpty()) {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                    return interfaceC0850nC5.g(strH, aVar, (ArrayList) ((C0800d) interfaceC0850nC6).m());
                }
                if (iOrdinal2 == 15) {
                    p185s8.u0.H(0, "BREAK", arrayList);
                    return InterfaceC0850n.f14368k;
                }
                if (iOrdinal2 == 25) {
                    return c(aVar, arrayList);
                }
                if (iOrdinal2 == 41) {
                    p185s8.u0.I(2, "IF", arrayList);
                    InterfaceC0850n interfaceC0850n2 = (InterfaceC0850n) arrayList.get(0);
                    C0879t c0879t3 = (C0879t) aVar.f555s;
                    C0879t c0879t4 = (C0879t) aVar.f555s;
                    InterfaceC0850n interfaceC0850nC7 = c0879t3.c(aVar, interfaceC0850n2);
                    InterfaceC0850n interfaceC0850nC8 = c0879t4.c(aVar, (InterfaceC0850n) arrayList.get(1));
                    InterfaceC0850n interfaceC0850nC9 = arrayList.size() > 2 ? c0879t4.c(aVar, (InterfaceC0850n) arrayList.get(2)) : null;
                    InterfaceC0850n interfaceC0850n3 = InterfaceC0850n.f14367i;
                    InterfaceC0850n interfaceC0850nO2 = interfaceC0850nC7.d().booleanValue() ? aVar.O((C0800d) interfaceC0850nC8) : interfaceC0850nC9 != null ? aVar.O((C0800d) interfaceC0850nC9) : interfaceC0850n3;
                    return true != (interfaceC0850nO2 instanceof C0810f) ? interfaceC0850n3 : interfaceC0850nO2;
                }
                if (iOrdinal2 == 54) {
                    return new C0800d(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return InterfaceC0850n.f14370m;
                    }
                    p185s8.u0.H(1, "RETURN", arrayList);
                    return new C0810f("return", ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        p185s8.u0.I(2, "DEFINE_FUNCTION", arrayList);
                        C0845m c0845mC = c(aVar, arrayList);
                        String str4 = c0845mC.f14325r;
                        if (str4 == null) {
                            aVar.S("", c0845mC);
                            return c0845mC;
                        }
                        aVar.S(str4, c0845mC);
                        return c0845mC;
                    }
                    if (iOrdinal2 == 60) {
                        p185s8.u0.H(3, "SWITCH", arrayList);
                        InterfaceC0850n interfaceC0850n4 = (InterfaceC0850n) arrayList.get(0);
                        C0879t c0879t5 = (C0879t) aVar.f555s;
                        C0879t c0879t6 = (C0879t) aVar.f555s;
                        InterfaceC0850n interfaceC0850nC10 = c0879t5.c(aVar, interfaceC0850n4);
                        InterfaceC0850n interfaceC0850nC11 = c0879t6.c(aVar, (InterfaceC0850n) arrayList.get(1));
                        InterfaceC0850n interfaceC0850nC12 = c0879t6.c(aVar, (InterfaceC0850n) arrayList.get(2));
                        if (!(interfaceC0850nC11 instanceof C0800d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                        }
                        if (!(interfaceC0850nC12 instanceof C0800d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        C0800d c0800d = (C0800d) interfaceC0850nC11;
                        C0800d c0800d2 = (C0800d) interfaceC0850nC12;
                        boolean z10 = false;
                        for (int i11 = 0; i11 < c0800d.o(); i11++) {
                            if (z10 || interfaceC0850nC10.equals(c0879t6.c(aVar, c0800d.p(i11)))) {
                                InterfaceC0850n interfaceC0850nC13 = c0879t6.c(aVar, c0800d2.p(i11));
                                if (interfaceC0850nC13 instanceof C0810f) {
                                    return ((C0810f) interfaceC0850nC13).f14242s.equals("break") ? InterfaceC0850n.f14367i : interfaceC0850nC13;
                                }
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (c0800d.o() + 1 == c0800d2.o()) {
                            InterfaceC0850n interfaceC0850nC14 = c0879t6.c(aVar, c0800d2.p(c0800d.o()));
                            if (interfaceC0850nC14 instanceof C0810f) {
                                String str5 = ((C0810f) interfaceC0850nC14).f14242s;
                                if (str5.equals("return") || str5.equals("continue")) {
                                    return interfaceC0850nC14;
                                }
                            }
                        }
                        return InterfaceC0850n.f14367i;
                    }
                    if (iOrdinal2 == 61) {
                        p185s8.u0.H(3, "TERNARY", arrayList);
                        InterfaceC0850n interfaceC0850n5 = (InterfaceC0850n) arrayList.get(0);
                        C0879t c0879t7 = (C0879t) aVar.f555s;
                        C0879t c0879t8 = (C0879t) aVar.f555s;
                        return c0879t7.c(aVar, interfaceC0850n5).d().booleanValue() ? c0879t8.c(aVar, (InterfaceC0850n) arrayList.get(1)) : c0879t8.c(aVar, (InterfaceC0850n) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return aVar.Q().O(new C0800d(arrayList));
                        case 12:
                            p185s8.u0.H(0, "BREAK", arrayList);
                            return InterfaceC0850n.f14369l;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return InterfaceC0850n.f14367i;
                }
                InterfaceC0850n interfaceC0850nC15 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                return interfaceC0850nC15 instanceof C0800d ? aVar.O((C0800d) interfaceC0850nC15) : InterfaceC0850n.f14367i;
            case 3:
                EnumC0894w enumC0894w3 = EnumC0894w.ADD;
                int iOrdinal3 = p185s8.u0.L(str).ordinal();
                if (iOrdinal3 == 1) {
                    p185s8.u0.H(2, "AND", arrayList);
                    InterfaceC0850n interfaceC0850nC16 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                    return interfaceC0850nC16.d().booleanValue() ? ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)) : interfaceC0850nC16;
                }
                if (iOrdinal3 == 47) {
                    p185s8.u0.H(1, "NOT", arrayList);
                    return new C0805e(Boolean.valueOf(!((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).d().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    b(str);
                    throw null;
                }
                p185s8.u0.H(2, "OR", arrayList);
                InterfaceC0850n interfaceC0850nC17 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                return !interfaceC0850nC17.d().booleanValue() ? ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)) : interfaceC0850nC17;
            case 4:
                EnumC0894w enumC0894w4 = EnumC0894w.ADD;
                int iOrdinal4 = p185s8.u0.L(str).ordinal();
                if (iOrdinal4 != 65) {
                    switch (iOrdinal4) {
                        case 26:
                            p185s8.u0.H(3, "FOR_IN", arrayList);
                            if (!(arrayList.get(0) instanceof C0865q)) {
                                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                            }
                            String strH2 = ((InterfaceC0850n) arrayList.get(0)).h();
                            InterfaceC0850n interfaceC0850nC18 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1));
                            InterfaceC0850n interfaceC0850nC19 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(2));
                            Iterator itF = interfaceC0850nC18.f();
                            if (itF != null) {
                                while (itF.hasNext()) {
                                    aVar.T(strH2, (InterfaceC0850n) itF.next());
                                    InterfaceC0850n interfaceC0850nO3 = aVar.O((C0800d) interfaceC0850nC19);
                                    if (interfaceC0850nO3 instanceof C0810f) {
                                        c0810f = (C0810f) interfaceC0850nO3;
                                        String str6 = c0810f.f14242s;
                                        if ("break".equals(str6)) {
                                            return InterfaceC0850n.f14367i;
                                        }
                                        if ("return".equals(str6)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return InterfaceC0850n.f14367i;
                        case 27:
                            p185s8.u0.H(3, "FOR_IN_CONST", arrayList);
                            if (arrayList.get(0) instanceof C0865q) {
                                return g(new C0889v(aVar, ((InterfaceC0850n) arrayList.get(0)).h(), 0), ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).f(), ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                        case 28:
                            p185s8.u0.H(3, "FOR_IN_LET", arrayList);
                            if (!(arrayList.get(0) instanceof C0865q)) {
                                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                            }
                            String strH3 = ((InterfaceC0850n) arrayList.get(0)).h();
                            InterfaceC0850n interfaceC0850nC20 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1));
                            InterfaceC0850n interfaceC0850nC21 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(2));
                            Iterator itF2 = interfaceC0850nC20.f();
                            if (itF2 != null) {
                                while (itF2.hasNext()) {
                                    InterfaceC0850n interfaceC0850n6 = (InterfaceC0850n) itF2.next();
                                    Aa.a aVarQ = aVar.Q();
                                    aVarQ.T(strH3, interfaceC0850n6);
                                    InterfaceC0850n interfaceC0850nO4 = aVarQ.O((C0800d) interfaceC0850nC21);
                                    if (interfaceC0850nO4 instanceof C0810f) {
                                        c0810f = (C0810f) interfaceC0850nO4;
                                        String str7 = c0810f.f14242s;
                                        if ("break".equals(str7)) {
                                            return InterfaceC0850n.f14367i;
                                        }
                                        if ("return".equals(str7)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return InterfaceC0850n.f14367i;
                        case 29:
                            p185s8.u0.H(4, "FOR_LET", arrayList);
                            InterfaceC0850n interfaceC0850n7 = (InterfaceC0850n) arrayList.get(0);
                            C0879t c0879t9 = (C0879t) aVar.f555s;
                            C0879t c0879t10 = (C0879t) aVar.f555s;
                            InterfaceC0850n interfaceC0850nC22 = c0879t9.c(aVar, interfaceC0850n7);
                            if (!(interfaceC0850nC22 instanceof C0800d)) {
                                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                            }
                            C0800d c0800d3 = (C0800d) interfaceC0850nC22;
                            InterfaceC0850n interfaceC0850n8 = (InterfaceC0850n) arrayList.get(1);
                            InterfaceC0850n interfaceC0850n9 = (InterfaceC0850n) arrayList.get(2);
                            InterfaceC0850n interfaceC0850nC23 = c0879t10.c(aVar, (InterfaceC0850n) arrayList.get(3));
                            Aa.a aVarQ2 = aVar.Q();
                            for (int i12 = 0; i12 < c0800d3.o(); i12++) {
                                String strH4 = c0800d3.p(i12).h();
                                aVarQ2.S(strH4, aVar.U(strH4));
                            }
                            while (c0879t10.c(aVar, interfaceC0850n8).d().booleanValue()) {
                                InterfaceC0850n interfaceC0850nO5 = aVar.O((C0800d) interfaceC0850nC23);
                                if (interfaceC0850nO5 instanceof C0810f) {
                                    C0810f c0810f2 = (C0810f) interfaceC0850nO5;
                                    String str8 = c0810f2.f14242s;
                                    if ("break".equals(str8)) {
                                        return InterfaceC0850n.f14367i;
                                    }
                                    if ("return".equals(str8)) {
                                        return c0810f2;
                                    }
                                }
                                Aa.a aVarQ3 = aVar.Q();
                                for (int i13 = 0; i13 < c0800d3.o(); i13++) {
                                    String strH5 = c0800d3.p(i13).h();
                                    aVarQ3.S(strH5, aVarQ2.U(strH5));
                                }
                                aVarQ3.N(interfaceC0850n9);
                                aVarQ2 = aVarQ3;
                            }
                            return InterfaceC0850n.f14367i;
                        case 30:
                            p185s8.u0.H(3, "FOR_OF", arrayList);
                            if (arrayList.get(0) instanceof C0865q) {
                                return e(new C0889v(aVar, ((InterfaceC0850n) arrayList.get(0)).h(), 2), ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)), ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                        case 31:
                            p185s8.u0.H(3, "FOR_OF_CONST", arrayList);
                            if (arrayList.get(0) instanceof C0865q) {
                                return e(new C0889v(aVar, ((InterfaceC0850n) arrayList.get(0)).h(), 0), ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)), ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                        case 32:
                            p185s8.u0.H(3, "FOR_OF_LET", arrayList);
                            if (arrayList.get(0) instanceof C0865q) {
                                return e(new C0889v(aVar, ((InterfaceC0850n) arrayList.get(0)).h(), 1), ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)), ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                        default:
                            b(str);
                            throw null;
                    }
                }
                p185s8.u0.H(4, "WHILE", arrayList);
                InterfaceC0850n interfaceC0850n10 = (InterfaceC0850n) arrayList.get(0);
                InterfaceC0850n interfaceC0850n11 = (InterfaceC0850n) arrayList.get(1);
                InterfaceC0850n interfaceC0850n12 = (InterfaceC0850n) arrayList.get(2);
                InterfaceC0850n interfaceC0850n13 = (InterfaceC0850n) arrayList.get(3);
                C0879t c0879t11 = (C0879t) aVar.f555s;
                C0879t c0879t12 = (C0879t) aVar.f555s;
                InterfaceC0850n interfaceC0850nC24 = c0879t11.c(aVar, interfaceC0850n13);
                if (!c0879t12.c(aVar, interfaceC0850n12).d().booleanValue()) {
                    while (c0879t12.c(aVar, interfaceC0850n10).d().booleanValue()) {
                        interfaceC0850nO = aVar.O((C0800d) interfaceC0850nC24);
                        if (interfaceC0850nO instanceof C0810f) {
                            c0810f = (C0810f) interfaceC0850nO;
                            str2 = c0810f.f14242s;
                            if ("break".equals(str2)) {
                                return InterfaceC0850n.f14367i;
                            }
                            if ("return".equals(str2)) {
                            }
                        }
                        aVar.N(interfaceC0850n11);
                    }
                    return InterfaceC0850n.f14367i;
                }
                InterfaceC0850n interfaceC0850nO6 = aVar.O((C0800d) interfaceC0850nC24);
                if (!(interfaceC0850nO6 instanceof C0810f)) {
                    while (c0879t12.c(aVar, interfaceC0850n10).d().booleanValue()) {
                        interfaceC0850nO = aVar.O((C0800d) interfaceC0850nC24);
                        if (interfaceC0850nO instanceof C0810f) {
                            c0810f = (C0810f) interfaceC0850nO;
                            str2 = c0810f.f14242s;
                            if ("break".equals(str2)) {
                                return InterfaceC0850n.f14367i;
                            }
                            if ("return".equals(str2)) {
                            }
                        }
                        aVar.N(interfaceC0850n11);
                    }
                    return InterfaceC0850n.f14367i;
                }
                c0810f = (C0810f) interfaceC0850nO6;
                String str9 = c0810f.f14242s;
                if ("break".equals(str9)) {
                    return InterfaceC0850n.f14367i;
                }
                if (!"return".equals(str9)) {
                    while (c0879t12.c(aVar, interfaceC0850n10).d().booleanValue()) {
                        interfaceC0850nO = aVar.O((C0800d) interfaceC0850nC24);
                        if (interfaceC0850nO instanceof C0810f) {
                            c0810f = (C0810f) interfaceC0850nO;
                            str2 = c0810f.f14242s;
                            if ("break".equals(str2)) {
                                return InterfaceC0850n.f14367i;
                            }
                            if ("return".equals(str2)) {
                            }
                        }
                        aVar.N(interfaceC0850n11);
                    }
                    return InterfaceC0850n.f14367i;
                }
                return c0810f;
            case 5:
                EnumC0894w enumC0894w5 = EnumC0894w.ADD;
                int iOrdinal5 = p185s8.u0.L(str).ordinal();
                if (iOrdinal5 == 0) {
                    p185s8.u0.H(2, "ADD", arrayList);
                    InterfaceC0850n interfaceC0850nC25 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                    InterfaceC0850n interfaceC0850nC26 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1));
                    c0865q = ((interfaceC0850nC25 instanceof InterfaceC0830j) || (interfaceC0850nC25 instanceof C0865q) || (interfaceC0850nC26 instanceof InterfaceC0830j) || (interfaceC0850nC26 instanceof C0865q)) ? new C0865q(String.valueOf(interfaceC0850nC25.h()).concat(String.valueOf(interfaceC0850nC26.h()))) : new C0815g(Double.valueOf(interfaceC0850nC26.b().doubleValue() + interfaceC0850nC25.b().doubleValue()));
                } else {
                    if (iOrdinal5 == 21) {
                        p185s8.u0.H(2, "DIVIDE", arrayList);
                        return new C0815g(Double.valueOf(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue() / ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue()));
                    }
                    if (iOrdinal5 == 59) {
                        p185s8.u0.H(2, "SUBTRACT", arrayList);
                        return new C0815g(Double.valueOf(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue() + (-((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        p185s8.u0.H(2, str, arrayList);
                        InterfaceC0850n interfaceC0850nC27 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                        aVar.N((InterfaceC0850n) arrayList.get(1));
                        return interfaceC0850nC27;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        p185s8.u0.H(1, str, arrayList);
                        return ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case 44:
                            p185s8.u0.H(2, "MODULUS", arrayList);
                            return new C0815g(Double.valueOf(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue() % ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue()));
                        case 45:
                            p185s8.u0.H(2, "MULTIPLY", arrayList);
                            c0865q = new C0815g(Double.valueOf(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue() * ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue()));
                            break;
                        case 46:
                            p185s8.u0.H(1, "NEGATE", arrayList);
                            return new C0815g(Double.valueOf(-((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return c0865q;
            case 6:
                if (str == null || str.isEmpty() || !aVar.R(str)) {
                    throw new IllegalArgumentException(p123m2.c.s("Command not found: ", str));
                }
                InterfaceC0850n interfaceC0850nU = aVar.U(str);
                if (interfaceC0850nU instanceof AbstractC0820h) {
                    return ((AbstractC0820h) interfaceC0850nU).a(aVar, arrayList);
                }
                throw new IllegalArgumentException(p245z2.a.D("Function ", str, " is not defined"));
            default:
                EnumC0894w enumC0894w6 = EnumC0894w.ADD;
                int iOrdinal6 = p185s8.u0.L(str).ordinal();
                if (iOrdinal6 != 3) {
                    if (iOrdinal6 == 14) {
                        p185s8.u0.I(2, "CONST", arrayList);
                        if (arrayList.size() % 2 != 0) {
                            throw new IllegalArgumentException(p123m2.c.r(arrayList.size(), "CONST requires an even number of arguments, found "));
                        }
                        while (i10 < arrayList.size() - 1) {
                            InterfaceC0850n interfaceC0850nC28 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(i10));
                            if (!(interfaceC0850nC28 instanceof C0865q)) {
                                throw new IllegalArgumentException(p123m2.c.s("Expected string for const name. got ", interfaceC0850nC28.getClass().getCanonicalName()));
                            }
                            String str10 = ((C0865q) interfaceC0850nC28).f14388r;
                            aVar.T(str10, ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(i10 + 1)));
                            ((HashMap) aVar.f557u).put(str10, Boolean.TRUE);
                            i10 += 2;
                        }
                        return InterfaceC0850n.f14367i;
                    }
                    if (iOrdinal6 == 24) {
                        p185s8.u0.I(1, "EXPRESSION_LIST", arrayList);
                        InterfaceC0850n interfaceC0850nC29 = InterfaceC0850n.f14367i;
                        while (i10 < arrayList.size()) {
                            interfaceC0850nC29 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(i10));
                            if (interfaceC0850nC29 instanceof C0810f) {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                            i10++;
                        }
                        return interfaceC0850nC29;
                    }
                    if (iOrdinal6 == 33) {
                        p185s8.u0.H(1, "GET", arrayList);
                        InterfaceC0850n interfaceC0850nC30 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                        if (interfaceC0850nC30 instanceof C0865q) {
                            return aVar.U(((C0865q) interfaceC0850nC30).f14388r);
                        }
                        throw new IllegalArgumentException(p123m2.c.s("Expected string for get var. got ", interfaceC0850nC30.getClass().getCanonicalName()));
                    }
                    if (iOrdinal6 == 49) {
                        p185s8.u0.H(0, "NULL", arrayList);
                        return InterfaceC0850n.j;
                    }
                    if (iOrdinal6 == 58) {
                        p185s8.u0.H(3, "SET_PROPERTY", arrayList);
                        InterfaceC0850n interfaceC0850n14 = (InterfaceC0850n) arrayList.get(0);
                        C0879t c0879t13 = (C0879t) aVar.f555s;
                        C0879t c0879t14 = (C0879t) aVar.f555s;
                        InterfaceC0850n interfaceC0850nC31 = c0879t13.c(aVar, interfaceC0850n14);
                        InterfaceC0850n interfaceC0850nC32 = c0879t14.c(aVar, (InterfaceC0850n) arrayList.get(1));
                        interfaceC0850nC2 = c0879t14.c(aVar, (InterfaceC0850n) arrayList.get(2));
                        if (interfaceC0850nC31 == InterfaceC0850n.f14367i || interfaceC0850nC31 == InterfaceC0850n.j) {
                            throw new IllegalStateException("Can't set property " + interfaceC0850nC32.h() + " of " + interfaceC0850nC31.h());
                        }
                        if ((interfaceC0850nC31 instanceof C0800d) && (interfaceC0850nC32 instanceof C0815g)) {
                            ((C0800d) interfaceC0850nC31).q(((C0815g) interfaceC0850nC32).f14246r.intValue(), interfaceC0850nC2);
                        } else if (interfaceC0850nC31 instanceof InterfaceC0830j) {
                            ((InterfaceC0830j) interfaceC0850nC31).j(interfaceC0850nC32.h(), interfaceC0850nC2);
                        }
                    } else {
                        if (iOrdinal6 == 17) {
                            if (arrayList.isEmpty()) {
                                return new C0800d();
                            }
                            C0800d c0800d4 = new C0800d();
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                InterfaceC0850n interfaceC0850nC33 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) obj);
                                if (interfaceC0850nC33 instanceof C0810f) {
                                    throw new IllegalStateException("Failed to evaluate array element");
                                }
                                c0800d4.q(i10, interfaceC0850nC33);
                                i10++;
                            }
                            return c0800d4;
                        }
                        if (iOrdinal6 == 18) {
                            if (arrayList.isEmpty()) {
                                return new C0835k();
                            }
                            if (arrayList.size() % 2 != 0) {
                                throw new IllegalArgumentException(p123m2.c.r(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            }
                            C0835k c0835k = new C0835k();
                            while (i10 < arrayList.size() - 1) {
                                InterfaceC0850n interfaceC0850nC34 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(i10));
                                InterfaceC0850n interfaceC0850nC35 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(i10 + 1));
                                if ((interfaceC0850nC34 instanceof C0810f) || (interfaceC0850nC35 instanceof C0810f)) {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                                c0835k.j(interfaceC0850nC34.h(), interfaceC0850nC35);
                                i10 += 2;
                            }
                            return c0835k;
                        }
                        if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                            p185s8.u0.H(2, "GET_PROPERTY", arrayList);
                            InterfaceC0850n interfaceC0850nC36 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                            InterfaceC0850n interfaceC0850nC37 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1));
                            if ((interfaceC0850nC36 instanceof C0800d) && p185s8.u0.K(interfaceC0850nC37)) {
                                return ((C0800d) interfaceC0850nC36).p(interfaceC0850nC37.b().intValue());
                            }
                            if (interfaceC0850nC36 instanceof InterfaceC0830j) {
                                return ((InterfaceC0830j) interfaceC0850nC36).c(interfaceC0850nC37.h());
                            }
                            if (interfaceC0850nC36 instanceof C0865q) {
                                if ("length".equals(interfaceC0850nC37.h())) {
                                    interfaceC0850nC2 = new C0815g(Double.valueOf(((C0865q) interfaceC0850nC36).f14388r.length()));
                                } else if (p185s8.u0.K(interfaceC0850nC37)) {
                                    double dDoubleValue = interfaceC0850nC37.b().doubleValue();
                                    String str11 = ((C0865q) interfaceC0850nC36).f14388r;
                                    if (dDoubleValue < str11.length()) {
                                        interfaceC0850nC = new C0865q(String.valueOf(str11.charAt(interfaceC0850nC37.b().intValue())));
                                    }
                                }
                            }
                            return InterfaceC0850n.f14367i;
                        }
                        switch (iOrdinal6) {
                            case 62:
                                p185s8.u0.H(1, "TYPEOF", arrayList);
                                InterfaceC0850n interfaceC0850nC38 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                                if (interfaceC0850nC38 instanceof r) {
                                    str3 = "undefined";
                                } else if (interfaceC0850nC38 instanceof C0805e) {
                                    str3 = "boolean";
                                } else if (interfaceC0850nC38 instanceof C0815g) {
                                    str3 = "number";
                                } else if (interfaceC0850nC38 instanceof C0865q) {
                                    str3 = "string";
                                } else if (interfaceC0850nC38 instanceof C0845m) {
                                    str3 = "function";
                                } else {
                                    if ((interfaceC0850nC38 instanceof C0855o) || (interfaceC0850nC38 instanceof C0810f)) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC0850nC38));
                                    }
                                    str3 = "object";
                                }
                                interfaceC0850nC2 = new C0865q(str3);
                                break;
                            case 63:
                                p185s8.u0.H(0, "UNDEFINED", arrayList);
                                return InterfaceC0850n.f14367i;
                            case 64:
                                p185s8.u0.I(1, "VAR", arrayList);
                                int size2 = arrayList.size();
                                while (i10 < size2) {
                                    Object obj2 = arrayList.get(i10);
                                    i10++;
                                    InterfaceC0850n interfaceC0850nC39 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) obj2);
                                    if (!(interfaceC0850nC39 instanceof C0865q)) {
                                        throw new IllegalArgumentException(p123m2.c.s("Expected string for var name. got ", interfaceC0850nC39.getClass().getCanonicalName()));
                                    }
                                    aVar.T(((C0865q) interfaceC0850nC39).f14388r, InterfaceC0850n.f14367i);
                                }
                                return InterfaceC0850n.f14367i;
                            default:
                                b(str);
                                throw null;
                        }
                    }
                    return interfaceC0850nC2;
                }
                p185s8.u0.H(2, "ASSIGN", arrayList);
                InterfaceC0850n interfaceC0850nC40 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                if (!(interfaceC0850nC40 instanceof C0865q)) {
                    throw new IllegalArgumentException(p123m2.c.s("Expected string for assign var. got ", interfaceC0850nC40.getClass().getCanonicalName()));
                }
                String str12 = ((C0865q) interfaceC0850nC40).f14388r;
                if (!aVar.R(str12)) {
                    throw new IllegalArgumentException(p123m2.c.s("Attempting to assign undefined value ", str12));
                }
                interfaceC0850nC = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1));
                aVar.S(str12, interfaceC0850nC);
                return interfaceC0850nC;
        }
    }

    public final void b(String str) {
        if (!this.f14392a.contains(p185s8.u0.L(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
