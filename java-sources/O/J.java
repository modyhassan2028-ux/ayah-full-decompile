package O;

import K0.C0344g;
import K0.C0351j0;
import K0.InterfaceC0353k0;
import K9.InterfaceC0402u;
import U0.C0512d;
import U0.C0513e;
import U0.C0515g;
import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class J extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f6301t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(N n6, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6299r = i10;
        this.f6301t = n6;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6299r) {
            case 0:
                return new J(this.f6301t, cVar, 0);
            default:
                return new J(this.f6301t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6299r) {
            case 0:
                break;
        }
        return ((J) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0378  */
    /* JADX WARN: Code duplicated, block: B:81:0x0189  */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p110k9.y yVar;
        Object c0351j0;
        C0515g c0515g;
        CharSequence text;
        Spanned spanned;
        int i10 = this.f6299r;
        K.L l10 = K.L.f4484r;
        p161p9.a aVar = p161p9.a.f21156r;
        N n6 = this.f6301t;
        p110k9.y yVar2 = p110k9.y.f19095a;
        switch (i10) {
            case 0:
                int i11 = this.f6300s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    if (U0.K.b(n6.k().f10954b)) {
                        return yVar2;
                    }
                    InterfaceC0353k0 interfaceC0353k0 = n6.f6314h;
                    if (interfaceC0353k0 != null) {
                        C0351j0 c0351j0G = u0.G(Y2.a.L(n6.k()));
                        this.f6300s = 1;
                        ((C0344g) interfaceC0353k0).a(c0351j0G);
                        yVar = yVar2;
                        if (yVar == aVar) {
                            return aVar;
                        }
                    }
                    C0515g c0515gQ = Y2.a.Q(n6.k(), n6.k().f10953a.f8060s.length());
                    C0515g c0515gP = Y2.a.P(n6.k(), n6.k().f10953a.f8060s.length());
                    C0512d c0512d = new C0512d(c0515gQ);
                    c0512d.a(c0515gP);
                    C0515g c0515gB = c0512d.b();
                    int iE = U0.K.e(n6.k().f10954b);
                    n6.f6310c.e(N.c(c0515gB, va.g.e(iE, iE)));
                    n6.o(l10);
                    n6.f6308a.f4438e = true;
                    return yVar;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                yVar = yVar2;
                C0515g c0515gQ2 = Y2.a.Q(n6.k(), n6.k().f10953a.f8060s.length());
                C0515g c0515gP2 = Y2.a.P(n6.k(), n6.k().f10953a.f8060s.length());
                C0512d c0512d2 = new C0512d(c0515gQ2);
                c0512d2.a(c0515gP2);
                C0515g c0515gB2 = c0512d2.b();
                int iE2 = U0.K.e(n6.k().f10954b);
                n6.f6310c.e(N.c(c0515gB2, va.g.e(iE2, iE2)));
                n6.o(l10);
                n6.f6308a.f4438e = true;
                return yVar;
            default:
                int i12 = this.f6300s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    InterfaceC0353k0 interfaceC0353k1 = n6.f6314h;
                    if (interfaceC0353k1 != null) {
                        this.f6300s = 1;
                        ClipData primaryClip = ((C0344g) interfaceC0353k1).f5073a.f5075a.getPrimaryClip();
                        c0351j0 = primaryClip != null ? new C0351j0(primaryClip) : null;
                        if (c0351j0 == aVar) {
                            return aVar;
                        }
                    } else {
                        yVar2 = yVar2;
                    }
                    return yVar2;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                c0351j0 = obj;
                C0351j0 c0351j1 = (C0351j0) c0351j0;
                if (c0351j1 != null) {
                    ClipData clipData = c0351j1.f5084a;
                    int i13 = 0;
                    ClipData.Item itemAt = clipData.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        yVar2 = yVar2;
                        c0515g = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, text.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        p251z9.j.e(annotationArr, "<this>");
                        int length = annotationArr.length - 1;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i14];
                                if (p251z9.j.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, i13);
                                    parcelObtain.unmarshall(bArrDecode, i13, bArrDecode.length);
                                    parcelObtain.setDataPosition(i13);
                                    long j = p180s0.q.g;
                                    long j10 = j;
                                    long jL = p063g1.o.f16266c;
                                    long jL2 = jL;
                                    Y0.l lVar = null;
                                    Y0.j jVar = null;
                                    Y0.k kVar = null;
                                    String string = null;
                                    p055f1.a aVar2 = null;
                                    p055f1.q qVar = null;
                                    p055f1.l lVar2 = null;
                                    p180s0.I i15 = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() > 1) {
                                            byte b5 = parcelObtain.readByte();
                                            i13 = i13;
                                            if (b5 != 1) {
                                                int i16 = 2;
                                                spanned = spanned2;
                                                if (b5 != 2) {
                                                    yVar2 = yVar2;
                                                    if (b5 == 3) {
                                                        if (parcelObtain.dataAvail() >= 4) {
                                                            lVar = new Y0.l(parcelObtain.readInt());
                                                        } else {
                                                            arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                        }
                                                    } else if (b5 == 4) {
                                                        if (parcelObtain.dataAvail() >= 1) {
                                                            byte b10 = parcelObtain.readByte();
                                                            jVar = new Y0.j((b10 != 0 && b10 == 1) ? 1 : i13);
                                                        } else {
                                                            arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                        }
                                                    } else if (b5 == 5) {
                                                        if (parcelObtain.dataAvail() >= 1) {
                                                            byte b11 = parcelObtain.readByte();
                                                            if (b11 == 0) {
                                                                i16 = i13;
                                                            } else if (b11 == 1) {
                                                                i16 = 65535;
                                                            } else if (b11 != 3) {
                                                                if (b11 == 2) {
                                                                    i16 = 1;
                                                                } else {
                                                                    i16 = i13;
                                                                }
                                                            }
                                                            kVar = new Y0.k(i16);
                                                        } else {
                                                            arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                        }
                                                    } else if (b5 == 6) {
                                                        string = parcelObtain.readString();
                                                    } else if (b5 == 7) {
                                                        if (parcelObtain.dataAvail() >= 5) {
                                                            byte b12 = parcelObtain.readByte();
                                                            long j11 = b12 == 1 ? 4294967296L : b12 == 2 ? 8589934592L : 0L;
                                                            jL2 = p063g1.p.a(j11, 0L) ? p063g1.o.f16266c : F9.n.L(j11, parcelObtain.readFloat());
                                                        } else {
                                                            arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                        }
                                                    } else if (b5 == 8) {
                                                        if (parcelObtain.dataAvail() >= 4) {
                                                            aVar2 = new p055f1.a(parcelObtain.readFloat());
                                                        } else {
                                                            arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                        }
                                                    } else if (b5 == 9) {
                                                        if (parcelObtain.dataAvail() >= 8) {
                                                            qVar = new p055f1.q(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                        } else {
                                                            arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                        }
                                                    } else if (b5 == 10) {
                                                        if (parcelObtain.dataAvail() >= 8) {
                                                            j10 = parcelObtain.readLong();
                                                            int i17 = p180s0.q.f21844h;
                                                        } else {
                                                            arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                        }
                                                    } else if (b5 == 11) {
                                                        if (parcelObtain.dataAvail() >= 4) {
                                                            int i18 = parcelObtain.readInt();
                                                            int i19 = (i18 & 2) != 0 ? 1 : i13;
                                                            int i20 = (i18 & 1) != 0 ? 1 : i13;
                                                            p055f1.l lVar3 = p055f1.l.f15915d;
                                                            p055f1.l lVar4 = p055f1.l.f15914c;
                                                            if (i19 != 0 && i20 != 0) {
                                                                p055f1.l[] lVarArr = new p055f1.l[2];
                                                                lVarArr[i13] = lVar3;
                                                                lVarArr[1] = lVar4;
                                                                List listS = p120l9.l.S(lVarArr);
                                                                Integer numValueOf = Integer.valueOf(i13);
                                                                int size = listS.size();
                                                                for (int i21 = i13; i21 < size; i21++) {
                                                                    numValueOf = Integer.valueOf(numValueOf.intValue() | ((p055f1.l) listS.get(i21)).f15916a);
                                                                }
                                                                lVar2 = new p055f1.l(numValueOf.intValue());
                                                            } else if (i19 != 0) {
                                                                lVar2 = lVar3;
                                                            } else {
                                                                lVar2 = i20 != 0 ? lVar4 : p055f1.l.f15913b;
                                                            }
                                                        } else {
                                                            arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                        }
                                                    } else if (b5 == 12) {
                                                        if (parcelObtain.dataAvail() >= 20) {
                                                            long j12 = parcelObtain.readLong();
                                                            int i22 = p180s0.q.f21844h;
                                                            spanned2 = spanned;
                                                            yVar2 = yVar2;
                                                            i15 = new p180s0.I(j12, (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) & 4294967295L), parcelObtain.readFloat());
                                                        } else {
                                                            arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                        }
                                                    }
                                                } else if (parcelObtain.dataAvail() >= 5) {
                                                    byte b13 = parcelObtain.readByte();
                                                    long j13 = b13 == 1 ? 4294967296L : b13 == 2 ? 8589934592L : 0L;
                                                    jL = p063g1.p.a(j13, 0L) ? p063g1.o.f16266c : F9.n.L(j13, parcelObtain.readFloat());
                                                } else {
                                                    yVar2 = yVar2;
                                                    arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                                }
                                                spanned2 = spanned;
                                                yVar2 = yVar2;
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                j = parcelObtain.readLong();
                                                int i23 = p180s0.q.f21844h;
                                            }
                                        } else {
                                            i13 = i13;
                                        }
                                        spanned = spanned2;
                                        yVar2 = yVar2;
                                        arrayList.add(new C0513e(spanStart, spanEnd, new U0.C(j, jL, lVar, jVar, kVar, (Y0.e) null, string, jL2, aVar2, qVar, (p012b1.c) null, j10, lVar2, i15, 49152)));
                                    }
                                } else {
                                    i13 = i13;
                                    spanned = spanned2;
                                    yVar2 = yVar2;
                                }
                                if (i14 != length) {
                                    i14++;
                                    i13 = i13;
                                    spanned2 = spanned;
                                    yVar2 = yVar2;
                                }
                            }
                        } else {
                            yVar2 = yVar2;
                        }
                        c0515g = new C0515g(4, text.toString(), arrayList);
                    } else {
                        c0515g = new C0515g(text.toString());
                        yVar2 = yVar2;
                    }
                    if (c0515g != null) {
                        C0512d c0512d3 = new C0512d(Y2.a.Q(n6.k(), n6.k().f10953a.f8060s.length()));
                        c0512d3.a(c0515g);
                        C0515g c0515gB3 = c0512d3.b();
                        C0515g c0515gP3 = Y2.a.P(n6.k(), n6.k().f10953a.f8060s.length());
                        C0512d c0512d4 = new C0512d(c0515gB3);
                        c0512d4.a(c0515gP3);
                        C0515g c0515gB4 = c0512d4.b();
                        int length2 = c0515g.f8060s.length() + U0.K.e(n6.k().f10954b);
                        n6.f6310c.e(N.c(c0515gB4, va.g.e(length2, length2)));
                        n6.o(l10);
                        n6.f6308a.f4438e = true;
                    }
                } else {
                    yVar2 = yVar2;
                }
                return yVar2;
        }
    }
}
