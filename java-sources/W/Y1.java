package W;

import H0.InterfaceC0215n;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 implements H0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D.P f8929c;

    public Y1(boolean z10, float f3, D.P p10) {
        this.f8927a = z10;
        this.f8928b = f3;
        this.f8929c = p10;
    }

    public static int f(List list, int i10, p241y9.e eVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj7 = list.get(i11);
            if (p251z9.j.a(X.M.b((H0.H) obj7), "TextField")) {
                int iIntValue = ((Number) eVar.invoke(obj7, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (p251z9.j.a(X.M.b((H0.H) obj2), "Label")) {
                        break;
                    }
                    i12++;
                }
                H0.H h7 = (H0.H) obj2;
                int iIntValue2 = h7 != null ? ((Number) eVar.invoke(h7, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i13);
                    if (p251z9.j.a(X.M.b((H0.H) obj3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                H0.H h10 = (H0.H) obj3;
                int iIntValue3 = h10 != null ? ((Number) eVar.invoke(h10, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i14);
                    if (p251z9.j.a(X.M.b((H0.H) obj4), "Prefix")) {
                        break;
                    }
                    i14++;
                }
                H0.H h11 = (H0.H) obj4;
                int iIntValue4 = h11 != null ? ((Number) eVar.invoke(h11, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i15);
                    if (p251z9.j.a(X.M.b((H0.H) obj5), "Suffix")) {
                        break;
                    }
                    i15++;
                }
                H0.H h12 = (H0.H) obj5;
                int iIntValue5 = h12 != null ? ((Number) eVar.invoke(h12, Integer.valueOf(i10))).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (p251z9.j.a(X.M.b((H0.H) obj6), "Leading")) {
                        break;
                    }
                    i16++;
                }
                H0.H h13 = (H0.H) obj6;
                int iIntValue6 = h13 != null ? ((Number) eVar.invoke(h13, Integer.valueOf(i10))).intValue() : 0;
                int size7 = list.size();
                for (int i17 = 0; i17 < size7; i17++) {
                    Object obj8 = list.get(i17);
                    if (p251z9.j.a(X.M.b((H0.H) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                H0.H h14 = (H0.H) obj;
                int iIntValue7 = h14 != null ? ((Number) eVar.invoke(h14, Integer.valueOf(i10))).intValue() : 0;
                long j = X.M.f9710a;
                int i18 = W1.f8894a;
                int i19 = iIntValue4 + iIntValue5;
                return Math.max(Math.max(iIntValue + i19, Math.max(iIntValue7 + i19, iIntValue2)) + iIntValue6 + iIntValue3, p063g1.a.j(j));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i10;
        Object obj5;
        Object obj6;
        Object obj7;
        List list2 = list;
        D.P p10 = this.f8929c;
        int iE = k7.E(p10.f909b);
        int iE2 = k7.E(p10.f911d);
        long jA = p063g1.a.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i11);
            if (p251z9.j.a(androidx.compose.ui.layout.a.a((H0.H) obj), "Leading")) {
                break;
            }
            i11++;
        }
        H0.H h7 = (H0.H) obj;
        H0.U uA = h7 != null ? h7.a(jA) : null;
        float f3 = X.M.f9711b;
        int i12 = uA != null ? uA.f3168r : 0;
        int iMax = Math.max(0, uA != null ? uA.f3169s : 0);
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i13);
            if (p251z9.j.a(androidx.compose.ui.layout.a.a((H0.H) obj2), "Trailing")) {
                break;
            }
            i13++;
        }
        H0.H h10 = (H0.H) obj2;
        H0.U uA2 = h10 != null ? h10.a(p063g1.b.j(jA, -i12, 0, 2)) : null;
        int i14 = i12 + (uA2 != null ? uA2.f3168r : 0);
        int iMax2 = Math.max(iMax, uA2 != null ? uA2.f3169s : 0);
        int size3 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i15);
            if (p251z9.j.a(androidx.compose.ui.layout.a.a((H0.H) obj3), "Prefix")) {
                break;
            }
            i15++;
        }
        H0.H h11 = (H0.H) obj3;
        H0.U uA3 = h11 != null ? h11.a(p063g1.b.j(jA, -i14, 0, 2)) : null;
        int i16 = (uA3 != null ? uA3.f3168r : 0) + i14;
        int iMax3 = Math.max(iMax2, uA3 != null ? uA3.f3169s : 0);
        int size4 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i17);
            int i18 = size4;
            if (p251z9.j.a(androidx.compose.ui.layout.a.a((H0.H) obj4), "Suffix")) {
                break;
            }
            i17++;
            size4 = i18;
        }
        H0.H h12 = (H0.H) obj4;
        H0.U uA4 = h12 != null ? h12.a(p063g1.b.j(jA, -i16, 0, 2)) : null;
        int i19 = i16 + (uA4 != null ? uA4.f3168r : 0);
        int iMax4 = Math.max(iMax3, uA4 != null ? uA4.f3169s : 0);
        int i20 = -i19;
        long jI = p063g1.b.i(i20, -iE2, jA);
        int size5 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size5) {
                i10 = iE2;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i21);
            i10 = iE2;
            int i22 = size5;
            if (p251z9.j.a(androidx.compose.ui.layout.a.a((H0.H) obj5), "Label")) {
                break;
            }
            i21++;
            size5 = i22;
            iE2 = i10;
        }
        H0.H h13 = (H0.H) obj5;
        H0.U uA5 = h13 != null ? h13.a(jI) : null;
        int size6 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i23);
            if (p251z9.j.a(androidx.compose.ui.layout.a.a((H0.H) obj6), "Supporting")) {
                break;
            }
            i23++;
        }
        H0.H h14 = (H0.H) obj6;
        int iP = h14 != null ? h14.P(p063g1.a.j(j)) : 0;
        int i24 = iE + (uA5 != null ? uA5.f3169s : 0);
        long jI2 = p063g1.b.i(i20, ((-i24) - i10) - iP, p063g1.a.a(j, 0, 0, 0, 0, 11));
        int size7 = list2.size();
        int i25 = 0;
        while (i25 < size7) {
            int i26 = size7;
            H0.H h15 = (H0.H) list2.get(i25);
            int i27 = i25;
            int i28 = i24;
            if (p251z9.j.a(androidx.compose.ui.layout.a.a(h15), "TextField")) {
                H0.U uA6 = h15.a(jI2);
                long jA2 = p063g1.a.a(jI2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i29);
                    int i30 = size8;
                    int i31 = i29;
                    if (p251z9.j.a(androidx.compose.ui.layout.a.a((H0.H) obj7), "Hint")) {
                        break;
                    }
                    i29 = i31 + 1;
                    size8 = i30;
                }
                H0.H h16 = (H0.H) obj7;
                H0.U uA7 = h16 != null ? h16.a(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(uA6.f3169s, uA7 != null ? uA7.f3169s : 0) + i28 + i10);
                int i32 = uA != null ? uA.f3168r : 0;
                int i33 = uA2 != null ? uA2.f3168r : 0;
                int i34 = i32;
                int i35 = (uA3 != null ? uA3.f3168r : 0) + (uA4 != null ? uA4.f3168r : 0);
                int iMax6 = Math.max(Math.max(uA6.f3168r + i35, Math.max((uA7 != null ? uA7.f3168r : 0) + i35, uA5 != null ? uA5.f3168r : 0)) + i34 + i33, p063g1.a.j(j));
                H0.U uA8 = h14 != null ? h14.a(p063g1.a.a(p063g1.b.j(jA, 0, -iMax5, 1), 0, iMax6, 0, 0, 9)) : null;
                int i36 = uA8 != null ? uA8.f3169s : 0;
                Y1 y10 = this;
                int iD = W1.d(uA6.f3169s, uA5 != null ? uA5.f3169s : 0, uA != null ? uA.f3169s : 0, uA2 != null ? uA2.f3169s : 0, uA3 != null ? uA3.f3169s : 0, uA4 != null ? uA4.f3169s : 0, uA7 != null ? uA7.f3169s : 0, uA8 != null ? uA8.f3169s : 0, y10.f8928b, j, k7.getDensity(), y10.f8929c);
                int i37 = iD - i36;
                int size9 = list2.size();
                int i38 = 0;
                while (i38 < size9) {
                    H0.H h17 = (H0.H) list2.get(i38);
                    H0.U u8 = uA5;
                    H0.U u10 = uA3;
                    if (p251z9.j.a(androidx.compose.ui.layout.a.a(h17), "Container")) {
                        H0.U uA9 = h17.a(p063g1.b.a(iMax6 != Integer.MAX_VALUE ? iMax6 : 0, iMax6, i37 != Integer.MAX_VALUE ? i37 : 0, i37));
                        H0.U u11 = uA6;
                        int i39 = iD;
                        return k7.g0(iMax6, i39, p120l9.s.f19441r, new X1(u8, iMax6, i39, u11, uA7, uA, uA2, u10, uA4, uA9, uA8, y10, iE, k7));
                    }
                    uA5 = u8;
                    i38++;
                    iD = iD;
                    uA6 = uA6;
                    list2 = list;
                    uA3 = u10;
                    y10 = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i25 = i27 + 1;
            list2 = list;
            size7 = i26;
            i24 = i28;
            jI2 = jI2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // H0.I
    public final int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return f(list, i10, C0574k0.f9200A);
    }

    @Override // H0.I
    public final int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return d(interfaceC0215n, list, i10, C0574k0.f9209z);
    }

    public final int d(InterfaceC0215n interfaceC0215n, List list, int i10, p241y9.e eVar) {
        Object obj;
        int iN;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i11;
        Object obj5;
        int i12;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (p251z9.j.a(X.M.b((H0.H) obj), "Leading")) {
                break;
            }
            i13++;
        }
        H0.H h7 = (H0.H) obj;
        if (h7 != null) {
            iN = i10 == Integer.MAX_VALUE ? i10 : i10 - h7.N(Integer.MAX_VALUE);
            iIntValue = ((Number) eVar.invoke(h7, Integer.valueOf(i10))).intValue();
        } else {
            iN = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (p251z9.j.a(X.M.b((H0.H) obj2), "Trailing")) {
                break;
            }
            i14++;
        }
        H0.H h10 = (H0.H) obj2;
        if (h10 != null) {
            int iN2 = h10.N(Integer.MAX_VALUE);
            if (iN != Integer.MAX_VALUE) {
                iN -= iN2;
            }
            iIntValue2 = ((Number) eVar.invoke(h10, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i15);
            if (p251z9.j.a(X.M.b((H0.H) obj3), "Label")) {
                break;
            }
            i15++;
        }
        Object obj8 = (H0.H) obj3;
        int iIntValue3 = obj8 != null ? ((Number) eVar.invoke(obj8, Integer.valueOf(iN))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i16);
            if (p251z9.j.a(X.M.b((H0.H) obj4), "Prefix")) {
                break;
            }
            i16++;
        }
        H0.H h11 = (H0.H) obj4;
        if (h11 != null) {
            int iIntValue4 = ((Number) eVar.invoke(h11, Integer.valueOf(iN))).intValue();
            int iN3 = h11.N(Integer.MAX_VALUE);
            if (iN != Integer.MAX_VALUE) {
                iN -= iN3;
            }
            i11 = iIntValue4;
        } else {
            i11 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i17);
            if (p251z9.j.a(X.M.b((H0.H) obj5), "Suffix")) {
                break;
            }
            i17++;
        }
        H0.H h12 = (H0.H) obj5;
        if (h12 != null) {
            int iIntValue5 = ((Number) eVar.invoke(h12, Integer.valueOf(iN))).intValue();
            int iN4 = h12.N(Integer.MAX_VALUE);
            if (iN != Integer.MAX_VALUE) {
                iN -= iN4;
            }
            i12 = iIntValue5;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            Object obj9 = list.get(i18);
            if (p251z9.j.a(X.M.b((H0.H) obj9), "TextField")) {
                int iIntValue6 = ((Number) eVar.invoke(obj9, Integer.valueOf(iN))).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i19);
                    if (p251z9.j.a(X.M.b((H0.H) obj6), "Hint")) {
                        break;
                    }
                    i19++;
                }
                Object obj10 = (H0.H) obj6;
                int iIntValue7 = obj10 != null ? ((Number) eVar.invoke(obj10, Integer.valueOf(iN))).intValue() : 0;
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i20);
                    if (p251z9.j.a(X.M.b((H0.H) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i20++;
                }
                Object obj12 = (H0.H) obj7;
                return W1.d(iIntValue6, iIntValue3, iIntValue, iIntValue2, i11, i12, iIntValue7, obj12 != null ? ((Number) eVar.invoke(obj12, Integer.valueOf(i10))).intValue() : 0, this.f8928b, X.M.f9710a, interfaceC0215n.getDensity(), this.f8929c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // H0.I
    public final int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return f(list, i10, C0574k0.f9208y);
    }

    @Override // H0.I
    public final int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return d(interfaceC0215n, list, i10, C0574k0.f9207x);
    }
}
