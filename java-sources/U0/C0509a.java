package U0;

import A.R0;
import I1.V;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import p180s0.AbstractC1295d;

/* JADX INFO: renamed from: U0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0509a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p022c1.c f8042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V0.r f8045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f8046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f8047f;

    /* JADX WARN: Code duplicated, block: B:102:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0198  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:139:0x020b  */
    /* JADX WARN: Code duplicated, block: B:140:0x020d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0229  */
    /* JADX WARN: Code duplicated, block: B:144:0x0243  */
    /* JADX WARN: Code duplicated, block: B:147:0x024d A[LOOP:1: B:145:0x0247->B:147:0x024d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x027a  */
    /* JADX WARN: Code duplicated, block: B:151:0x027e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0296  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0119  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:96:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x027e, please report this as an issue */
    public C0509a(p022c1.c cVar, int i10, int i11, long j) {
        int i12;
        CharSequence charSequence;
        int i13;
        int i14;
        int i15;
        char c10;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        V0.r rVarA;
        int i16;
        C0509a c0509a;
        int i17;
        int i18;
        int i19;
        Layout layout;
        Spanned spanned;
        p043e1.b[] bVarArr;
        CharSequence charSequence2;
        Spanned spanned2;
        ArrayList arrayList;
        int i20;
        Object obj;
        int spanEnd;
        int lineForOffset;
        boolean z10;
        boolean z11;
        boolean z12;
        p171r0.e eVar;
        float fH;
        V vH;
        int i21;
        this.f8042a = cVar;
        this.f8043b = i10;
        this.f8044c = j;
        if (p063g1.a.i(j) != 0 || p063g1.a.j(j) != 0) {
            p002a1.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i10 < 1) {
            p002a1.a.a("maxLines should be greater than 0");
        }
        L l10 = cVar.f13419b;
        CharSequence charSequence3 = cVar.f13424h;
        if (i11 == 2) {
            i12 = 0;
            if (!p063g1.o.a(l10.f8037a.f8000h, F9.n.B(0)) && !p063g1.o.a(l10.f8037a.f8000h, p063g1.o.f16266c) && (i21 = l10.f8038b.f8124a) != Integer.MIN_VALUE && i21 != 5 && i21 != 4 && charSequence3.length() != 0) {
                Spannable spannableString = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                if (spannableString == null) {
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    spannableString = new SpannableString(charSequence3);
                }
                charSequence = charSequence3;
                charSequence = charSequence3;
                Spannable spannable = spannableString;
                boolean zF = V0.o.f(spannable, X0.c.class);
                charSequence = spannable;
                if (!zF) {
                    spannable.setSpan(new X0.c(), spannable.length() - 1, spannable.length() - 1, 33);
                    charSequence = spannable;
                }
            }
        } else {
            i12 = 0;
            charSequence = charSequence3;
        }
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        CharSequence charSequence4 = charSequence;
        this.f8046e = charSequence4;
        u uVar = l10.f8038b;
        C c11 = l10.f8037a;
        int i22 = uVar.f8124a;
        int i23 = 3;
        int i24 = i22 == 1 ? 3 : i22 == 2 ? 4 : i22 == 3 ? 2 : (i22 != 5 && i22 == 6) ? 1 : i12;
        int i25 = i22 == 4 ? 1 : i12;
        int i26 = uVar.f8130h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i12;
        int i27 = uVar.g;
        int i28 = i27 & 255;
        if (i28 == 1) {
            i13 = i12;
        } else if (i28 == 2) {
            i13 = 1;
        } else if (i28 == 3) {
            i13 = 2;
        } else {
            i13 = i12;
        }
        int i29 = (i27 >> 8) & 255;
        if (i29 == 1) {
            i23 = i12;
        } else if (i29 == 2) {
            i23 = 1;
        } else if (i29 == 3) {
            i23 = 2;
        } else if (i29 != 4) {
            i23 = i12;
        }
        int i30 = (i27 >> 16) & 255;
        if (i30 != 1) {
            i14 = 2;
            i15 = i30 == 2 ? 1 : i15;
            if (i11 == i14) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i11 == 5) {
                    if (i11 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c10 = ' ';
                        truncateAt = null;
                    }
                    rVarA = a(i24, i25, truncateAt, i10, i26, i13, i23, i15, charSequence4);
                    Layout layout2 = rVarA.f8389f;
                    i16 = i24;
                    if (Build.VERSION.SDK_INT < 35 || cVar.g.getLetterSpacing() == 0.0f || (!(i11 == 4 || i11 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        c0509a = this;
                        i17 = i10;
                        i18 = i16;
                        i19 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i19 = 2;
                        CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                        C0509a c0509a2 = this;
                        i17 = i10;
                        i18 = i16;
                        rVarA = c0509a2.a(i18, i25, truncateAt, i17, i26, i13, i23, i15, TextUtils.concat(charSequenceArr));
                        c0509a = c0509a2;
                    }
                    int i31 = rVarA.g;
                    if (i11 == i19 || rVarA.a() <= p063g1.a.g(j) || i17 <= 1) {
                        c0509a.f8045d = rVarA;
                    } else {
                        int iG = p063g1.a.g(j);
                        int i32 = 0;
                        while (true) {
                            if (i32 >= i31) {
                                i32 = i31;
                                break;
                            } else if (rVarA.e(i32) > iG) {
                                break;
                            } else {
                                i32++;
                            }
                        }
                        if (i32 >= 0 && i32 != c0509a.f8043b) {
                            rVarA = c0509a.a(i18, i25, truncateAt, i32 < 1 ? 1 : i32, i26, i13, i23, i15, c0509a.f8046e);
                        }
                        c0509a.f8045d = rVarA;
                    }
                    c0509a.f8042a.g.c(c11.f7994a.e(), (((long) Float.floatToRawIntBits(c0509a.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0509a.d())) << c10), c11.f7994a.c());
                    layout = c0509a.f8045d.f8389f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        p251z9.j.c(text, "null cannot be cast to non-null type android.text.Spanned");
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), p043e1.b.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            p251z9.j.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                            bVarArr = (p043e1.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), p043e1.b.class);
                        } else {
                            bVarArr = null;
                        }
                    } else {
                        bVarArr = null;
                    }
                    if (bVarArr != null) {
                        vH = p251z9.j.h(bVarArr);
                        while (vH.hasNext()) {
                            ((p043e1.b) vH.next()).f15752t.setValue(new p171r0.i((((long) Float.floatToRawIntBits(c0509a.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0509a.d())) << c10)));
                        }
                    }
                    charSequence2 = c0509a.f8046e;
                    if (charSequence2 instanceof Spanned) {
                        spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), X0.i.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj2 : spans) {
                            X0.i iVar = (X0.i) obj2;
                            int spanStart = spanned2.getSpanStart(iVar);
                            spanEnd = spanned2.getSpanEnd(iVar);
                            lineForOffset = c0509a.f8045d.f8389f.getLineForOffset(spanStart);
                            if (lineForOffset >= c0509a.f8043b) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0509a.f8045d.f8389f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= c0509a.f8045d.f8389f.getEllipsisStart(lineForOffset)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (spanEnd > c0509a.f8045d.f(lineForOffset)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z11 && !z12 && !z10) {
                                int iOrdinal = (c0509a.f8045d.f8389f.isRtlCharAt(spanStart) ? p055f1.j.f15910s : p055f1.j.f15909r).ordinal();
                                if (iOrdinal == 0) {
                                    fH = c0509a.f8045d.h(spanStart, false);
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new A6.a();
                                    }
                                    float fH2 = c0509a.f8045d.h(spanStart, false);
                                    if (!iVar.f9835u) {
                                        p002a1.a.b("PlaceholderSpan is not laid out yet.");
                                    }
                                    fH = fH2 - iVar.f9833s;
                                }
                                if (!iVar.f9835u) {
                                    p002a1.a.b("PlaceholderSpan is not laid out yet.");
                                }
                                float f3 = iVar.f9833s + fH;
                                float fD = c0509a.f8045d.d(lineForOffset) - iVar.b();
                                eVar = new p171r0.e(fH, fD, f3, iVar.b() + fD);
                            }
                            arrayList.add(eVar);
                        }
                        obj = arrayList;
                    } else {
                        obj = p120l9.r.f19440r;
                    }
                    c0509a.f8047f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c10 = ' ';
            truncateAt = truncateAt2;
            rVarA = a(i24, i25, truncateAt, i10, i26, i13, i23, i15, charSequence4);
            Layout layout3 = rVarA.f8389f;
            i16 = i24;
            if (Build.VERSION.SDK_INT < 35) {
                c0509a = this;
                i17 = i10;
                i18 = i16;
                i19 = 2;
            } else {
                c0509a = this;
                i17 = i10;
                i18 = i16;
                i19 = 2;
            }
            int i33 = rVarA.g;
            if (i11 == i19) {
                c0509a.f8045d = rVarA;
            } else {
                c0509a.f8045d = rVarA;
            }
            c0509a.f8042a.g.c(c11.f7994a.e(), (((long) Float.floatToRawIntBits(c0509a.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0509a.d())) << c10), c11.f7994a.c());
            layout = c0509a.f8045d.f8389f;
            if (layout.getText() instanceof Spanned) {
                bVarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                p251z9.j.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), p043e1.b.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    p251z9.j.c(text4, "null cannot be cast to non-null type android.text.Spanned");
                    bVarArr = (p043e1.b[]) ((Spanned) text4).getSpans(0, layout.getText().length(), p043e1.b.class);
                } else {
                    bVarArr = null;
                }
            }
            if (bVarArr != null) {
                vH = p251z9.j.h(bVarArr);
                while (vH.hasNext()) {
                    ((p043e1.b) vH.next()).f15752t.setValue(new p171r0.i((((long) Float.floatToRawIntBits(c0509a.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0509a.d())) << c10)));
                }
            }
            charSequence2 = c0509a.f8046e;
            if (charSequence2 instanceof Spanned) {
                obj = p120l9.r.f19440r;
            } else {
                spanned2 = (Spanned) charSequence2;
                Object[] spans2 = spanned2.getSpans(0, charSequence2.length(), X0.i.class);
                arrayList = new ArrayList(spans2.length);
                while (i20 < r4) {
                    X0.i iVar2 = (X0.i) obj2;
                    int spanStart2 = spanned2.getSpanStart(iVar2);
                    spanEnd = spanned2.getSpanEnd(iVar2);
                    lineForOffset = c0509a.f8045d.f8389f.getLineForOffset(spanStart2);
                    if (lineForOffset >= c0509a.f8043b) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0509a.f8045d.f8389f.getEllipsisCount(lineForOffset) > 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (spanEnd > c0509a.f8045d.f(lineForOffset)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    eVar = z11 ? null : null;
                    arrayList.add(eVar);
                }
                obj = arrayList;
            }
            c0509a.f8047f = obj;
        }
        i14 = 2;
        i15 = i12;
        if (i11 == i14) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i11 == 5) {
                if (i11 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c10 = ' ';
                    truncateAt = null;
                }
                rVarA = a(i24, i25, truncateAt, i10, i26, i13, i23, i15, charSequence4);
                Layout layout4 = rVarA.f8389f;
                i16 = i24;
                if (Build.VERSION.SDK_INT < 35) {
                    c0509a = this;
                    i17 = i10;
                    i18 = i16;
                    i19 = 2;
                } else {
                    c0509a = this;
                    i17 = i10;
                    i18 = i16;
                    i19 = 2;
                }
                int i34 = rVarA.g;
                if (i11 == i19) {
                    c0509a.f8045d = rVarA;
                } else {
                    c0509a.f8045d = rVarA;
                }
                c0509a.f8042a.g.c(c11.f7994a.e(), (((long) Float.floatToRawIntBits(c0509a.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0509a.d())) << c10), c11.f7994a.c());
                layout = c0509a.f8045d.f8389f;
                if (layout.getText() instanceof Spanned) {
                    bVarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    p251z9.j.c(text5, "null cannot be cast to non-null type android.text.Spanned");
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), p043e1.b.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        p251z9.j.c(text6, "null cannot be cast to non-null type android.text.Spanned");
                        bVarArr = (p043e1.b[]) ((Spanned) text6).getSpans(0, layout.getText().length(), p043e1.b.class);
                    } else {
                        bVarArr = null;
                    }
                }
                if (bVarArr != null) {
                    vH = p251z9.j.h(bVarArr);
                    while (vH.hasNext()) {
                        ((p043e1.b) vH.next()).f15752t.setValue(new p171r0.i((((long) Float.floatToRawIntBits(c0509a.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0509a.d())) << c10)));
                    }
                }
                charSequence2 = c0509a.f8046e;
                if (charSequence2 instanceof Spanned) {
                    obj = p120l9.r.f19440r;
                } else {
                    spanned2 = (Spanned) charSequence2;
                    Object[] spans3 = spanned2.getSpans(0, charSequence2.length(), X0.i.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i20 < r4) {
                        X0.i iVar3 = (X0.i) obj2;
                        int spanStart3 = spanned2.getSpanStart(iVar3);
                        spanEnd = spanned2.getSpanEnd(iVar3);
                        lineForOffset = c0509a.f8045d.f8389f.getLineForOffset(spanStart3);
                        if (lineForOffset >= c0509a.f8043b) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0509a.f8045d.f8389f.getEllipsisCount(lineForOffset) > 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (spanEnd > c0509a.f8045d.f(lineForOffset)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                        }
                        arrayList.add(eVar);
                    }
                    obj = arrayList;
                }
                c0509a.f8047f = obj;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c10 = ' ';
        truncateAt = truncateAt2;
        rVarA = a(i24, i25, truncateAt, i10, i26, i13, i23, i15, charSequence4);
        Layout layout5 = rVarA.f8389f;
        i16 = i24;
        if (Build.VERSION.SDK_INT < 35) {
            c0509a = this;
            i17 = i10;
            i18 = i16;
            i19 = 2;
        } else {
            c0509a = this;
            i17 = i10;
            i18 = i16;
            i19 = 2;
        }
        int i35 = rVarA.g;
        if (i11 == i19) {
            c0509a.f8045d = rVarA;
        } else {
            c0509a.f8045d = rVarA;
        }
        c0509a.f8042a.g.c(c11.f7994a.e(), (((long) Float.floatToRawIntBits(c0509a.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0509a.d())) << c10), c11.f7994a.c());
        layout = c0509a.f8045d.f8389f;
        if (layout.getText() instanceof Spanned) {
            bVarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            p251z9.j.c(text7, "null cannot be cast to non-null type android.text.Spanned");
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), p043e1.b.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                p251z9.j.c(text8, "null cannot be cast to non-null type android.text.Spanned");
                bVarArr = (p043e1.b[]) ((Spanned) text8).getSpans(0, layout.getText().length(), p043e1.b.class);
            } else {
                bVarArr = null;
            }
        }
        if (bVarArr != null) {
            vH = p251z9.j.h(bVarArr);
            while (vH.hasNext()) {
                ((p043e1.b) vH.next()).f15752t.setValue(new p171r0.i((((long) Float.floatToRawIntBits(c0509a.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0509a.d())) << c10)));
            }
        }
        charSequence2 = c0509a.f8046e;
        if (charSequence2 instanceof Spanned) {
            obj = p120l9.r.f19440r;
        } else {
            spanned2 = (Spanned) charSequence2;
            Object[] spans4 = spanned2.getSpans(0, charSequence2.length(), X0.i.class);
            arrayList = new ArrayList(spans4.length);
            while (i20 < r4) {
                X0.i iVar4 = (X0.i) obj2;
                int spanStart4 = spanned2.getSpanStart(iVar4);
                spanEnd = spanned2.getSpanEnd(iVar4);
                lineForOffset = c0509a.f8045d.f8389f.getLineForOffset(spanStart4);
                if (lineForOffset >= c0509a.f8043b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0509a.f8045d.f8389f.getEllipsisCount(lineForOffset) > 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (spanEnd > c0509a.f8045d.f(lineForOffset)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                }
                arrayList.add(eVar);
            }
            obj = arrayList;
        }
        c0509a.f8047f = obj;
    }

    public final V0.r a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        w wVar;
        float fD = d();
        p022c1.c cVar = this.f8042a;
        p022c1.d dVar = cVar.g;
        int i17 = cVar.f13427l;
        V0.l lVar = cVar.f13425i;
        L l10 = cVar.f13419b;
        p022c1.a aVar = p022c1.b.f13417a;
        x xVar = l10.f8039c;
        return new V0.r(charSequence, fD, dVar, i10, truncateAt, i17, (xVar == null || (wVar = xVar.f8135a) == null) ? false : wVar.f8134a, i12, i14, i15, i16, i13, i11, lVar);
    }

    public final float b() {
        return this.f8045d.a();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    public final long c(p171r0.e eVar, int i10, J1.c cVar) {
        W0.d bVar;
        int i11;
        int[] iArrA;
        RectF rectFT = p180s0.F.t(eVar);
        int i12 = (i10 != 0 && i10 == 1) ? 1 : 0;
        R0 r10 = new R0(11, cVar);
        V0.r rVar = this.f8045d;
        Layout layout = rVar.f8389f;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            iArrA = V0.b.a(rVar, rectFT, i12, r10);
        } else {
            E6.u uVarC = rVar.c();
            if (i12 == 1) {
                bVar = new L5.c(12, layout.getText(), rVar.j(), false);
            } else {
                CharSequence text = layout.getText();
                bVar = i13 >= 29 ? new W0.b(text, rVar.f8384a) : new W0.c(text);
            }
            W0.d dVar = bVar;
            int lineForVertical = layout.getLineForVertical((int) rectFT.top);
            if (rectFT.top <= rVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < rVar.g) {
                int i14 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFT.bottom);
                if (lineForVertical2 != 0 || rectFT.bottom >= rVar.g(0)) {
                    int iE = V0.o.e(rVar, layout, uVarC, i14, rectFT, dVar, r10, true);
                    while (true) {
                        i11 = i14;
                        if (iE != -1 || i11 >= lineForVertical2) {
                            break;
                        }
                        i14 = i11 + 1;
                        iE = V0.o.e(rVar, layout, uVarC, i14, rectFT, dVar, r10, true);
                    }
                    if (iE == -1) {
                        iArrA = null;
                    } else {
                        int i15 = lineForVertical2;
                        int iE2 = V0.o.e(rVar, layout, uVarC, i15, rectFT, dVar, r10, false);
                        while (iE2 == -1 && i11 < i15) {
                            i15--;
                            iE2 = V0.o.e(rVar, layout, uVarC, i15, rectFT, dVar, r10, false);
                        }
                        if (iE2 == -1) {
                            iArrA = null;
                        } else {
                            iArrA = new int[]{dVar.d(iE + 1), dVar.e(iE2 - 1)};
                        }
                    }
                } else {
                    iArrA = null;
                }
            } else {
                iArrA = null;
            }
        }
        return iArrA == null ? K.f8033b : va.g.e(iArrA[0], iArrA[1]);
    }

    public final float d() {
        return p063g1.a.h(this.f8044c);
    }

    public final void e(p180s0.o oVar) {
        Canvas canvasA = AbstractC1295d.a(oVar);
        V0.r rVar = this.f8045d;
        if (rVar.f8387d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i10 = rVar.f8390h;
        if (canvasA.getClipBounds(rVar.f8397p)) {
            if (i10 != 0) {
                canvasA.translate(0.0f, i10);
            }
            V0.q qVar = V0.s.f8399a;
            qVar.f8383a = canvasA;
            rVar.f8389f.draw(qVar);
            if (i10 != 0) {
                canvasA.translate(0.0f, (-1) * i10);
            }
        }
        if (rVar.f8387d) {
            canvasA.restore();
        }
    }

    public final void f(p180s0.o oVar, long j, p180s0.I i10, p055f1.l lVar, p196u0.c cVar) {
        p022c1.d dVar = this.f8042a.g;
        int i11 = dVar.f13430c;
        dVar.d(j);
        dVar.f(i10);
        dVar.g(lVar);
        dVar.e(cVar);
        dVar.b(3);
        e(oVar);
        dVar.b(i11);
    }

    public final void g(p180s0.o oVar, p180s0.F f3, float f7, p180s0.I i10, p055f1.l lVar, p196u0.c cVar) {
        p022c1.d dVar = this.f8042a.g;
        int i11 = dVar.f13430c;
        float fD = d();
        dVar.c(f3, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f7);
        dVar.f(i10);
        dVar.g(lVar);
        dVar.e(cVar);
        dVar.b(3);
        e(oVar);
        dVar.b(i11);
    }
}
