package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0865q implements Iterable, InterfaceC0850n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f14388r;

    public C0865q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f14388r = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Double b() {
        String str = this.f14388r;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Boolean d() {
        return Boolean.valueOf(!this.f14388r.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0865q) {
            return this.f14388r.equals(((C0865q) obj).f14388r);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Iterator f() {
        return new C0860p(0, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02f5 A[PHI: r7
      0x02f5: PHI (r7v6 boolean) = (r7v13 boolean), (r7v14 boolean), (r7v17 boolean) binds: [B:100:0x02e1, B:101:0x02e3, B:103:0x02f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n g(String str, Aa.a aVar, ArrayList arrayList) {
        String str2;
        int i10;
        int i11;
        int i12;
        boolean zIsEmpty;
        Aa.a aVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        int iHashCode = str.hashCode();
        String strH = "undefined";
        String str3 = this.f14388r;
        z = false;
        boolean z10 = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    p185s8.u0.H(1, "hasOwnProperty", arrayList);
                    InterfaceC0850n interfaceC0850nC = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                    boolean zEquals = "length".equals(interfaceC0850nC.h());
                    C0805e c0805e = InterfaceC0850n.f14371n;
                    if (zEquals) {
                        return c0805e;
                    }
                    double dDoubleValue = interfaceC0850nC.b().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str3.length()) ? InterfaceC0850n.f14372o : c0805e;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    p185s8.u0.H(0, "toString", arrayList);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    p185s8.u0.H(0, "toLocaleLowerCase", arrayList);
                    return new C0865q(str3.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    p185s8.u0.J(1, "charAt", arrayList);
                    int iO = arrayList.isEmpty() ? 0 : (int) p185s8.u0.O(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue());
                    return (iO < 0 || iO >= str3.length()) ? InterfaceC0850n.f14373p : new C0865q(String.valueOf(str3.charAt(iO)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            sb.append(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(i13)).h());
                        }
                        return new C0865q(sb.toString());
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    p185s8.u0.H(0, "toLowerCase", arrayList);
                    return new C0865q(str3.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    p185s8.u0.J(1, "search", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).h()).matcher(str3);
                    return matcher.find() ? new C0815g(Double.valueOf(matcher.start())) : new C0815g(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    p185s8.u0.H(0, "toLocaleUpperCase", arrayList);
                    return new C0865q(str3.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    p185s8.u0.J(2, "lastIndexOf", arrayList);
                    String strH2 = arrayList.size() > 0 ? ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).h() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue();
                    return new C0815g(Double.valueOf(str3.lastIndexOf(strH2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : p185s8.u0.O(dDoubleValue2)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    p185s8.u0.H(0, "toUpperCase", arrayList);
                    return new C0865q(str3.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str2)) {
                    p185s8.u0.H(0, "toUpperCase", arrayList);
                    return new C0865q(str3.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    p185s8.u0.J(1, "match", arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).h()).matcher(str3);
                    return matcher2.find() ? new C0800d(Arrays.asList(new C0865q(matcher2.group()))) : InterfaceC0850n.j;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    p185s8.u0.J(2, "slice", arrayList);
                    double dO = p185s8.u0.O(!arrayList.isEmpty() ? ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue() : 0.0d);
                    double dMax = dO < 0.0d ? Math.max(((double) str3.length()) + dO, 0.0d) : Math.min(dO, str3.length());
                    double dO2 = p185s8.u0.O(arrayList.size() > 1 ? ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue() : str3.length());
                    int i14 = (int) dMax;
                    return new C0865q(str3.substring(i14, Math.max(0, ((int) (dO2 < 0.0d ? Math.max(((double) str3.length()) + dO2, 0.0d) : Math.min(dO2, str3.length()))) - i14) + i14));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    p185s8.u0.J(2, "split", arrayList);
                    if (str3.length() == 0) {
                        return new C0800d(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strH3 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).h();
                        long jN = arrayList.size() > 1 ? ((long) p185s8.u0.N(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue())) & 4294967295L : 2147483647L;
                        if (jN == 0) {
                            return new C0800d();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strH3), ((int) jN) + 1);
                        int length = strArrSplit.length;
                        if (!strH3.isEmpty() || length <= 0) {
                            i12 = zIsEmpty;
                            z10 = zIsEmpty;
                            i11 = length;
                            i12 = z10;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i11 = length - 1;
                            if (!strArrSplit[i11].isEmpty()) {
                                i12 = zIsEmpty;
                                z10 = zIsEmpty;
                                i11 = length;
                                i12 = z10;
                            }
                        }
                        i12 = zIsEmpty;
                        z10 = zIsEmpty;
                        if (length > jN) {
                            i11--;
                        }
                        while (i12 < i11) {
                            arrayList2.add(new C0865q(strArrSplit[i12]));
                            i12++;
                        }
                    }
                    return new C0800d(arrayList2);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    p185s8.u0.J(2, "substring", arrayList);
                    int iO2 = !arrayList.isEmpty() ? (int) p185s8.u0.O(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).b().doubleValue()) : 0;
                    int iO3 = arrayList.size() > 1 ? (int) p185s8.u0.O(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1)).b().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iO2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iO3, 0), str3.length());
                    return new C0865q(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                if (str.equals("replace")) {
                    p185s8.u0.J(2, "replace", arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    InterfaceC0850n interfaceC0850nA = InterfaceC0850n.f14367i;
                    if (!zIsEmpty2) {
                        strH = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).h();
                        if (arrayList.size() > 1) {
                            interfaceC0850nA = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1));
                        }
                    }
                    String str4 = strH;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (interfaceC0850nA instanceof AbstractC0820h) {
                            interfaceC0850nA = ((AbstractC0820h) interfaceC0850nA).a(aVar, Arrays.asList(new C0865q(str4), new C0815g(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strH4 = interfaceC0850nA.h();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strH4).length() + String.valueOf(strSubstring2).length());
                        sb2.append(strSubstring);
                        sb2.append(strH4);
                        sb2.append(strSubstring2);
                        return new C0865q(sb2.toString());
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    p185s8.u0.J(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        aVar2 = aVar;
                    } else {
                        aVar2 = aVar;
                        strH = ((C0879t) aVar2.f555s).c(aVar2, (InterfaceC0850n) arrayList.get(0)).h();
                    }
                    return new C0815g(Double.valueOf(str3.indexOf(strH, (int) p185s8.u0.O(arrayList.size() < 2 ? 0.0d : ((C0879t) aVar2.f555s).c(aVar2, (InterfaceC0850n) arrayList.get(1)).b().doubleValue()))));
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final String h() {
        return this.f14388r;
    }

    public final int hashCode() {
        return this.f14388r.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0860p(1, this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n l() {
        return new C0865q(this.f14388r);
    }

    public final String toString() {
        String str = this.f14388r;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }
}
