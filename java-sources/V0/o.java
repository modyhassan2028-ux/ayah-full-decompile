package V0;

import A.R0;
import E6.u;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i10, int i11, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, boolean z10, int i15, int i16, int i17, int i18) {
        if (i11 < 0) {
            p002a1.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            p002a1.a.a("invalid end value");
        }
        if (i12 < 0) {
            p002a1.a.a("invalid maxLines value");
        }
        if (i10 < 0) {
            p002a1.a.a("invalid width value");
        }
        if (i13 < 0) {
            p002a1.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i11, textPaint, i10);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i12);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i13);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z10);
        builderObtain.setBreakStrategy(i15);
        builderObtain.setHyphenationFrequency(i18);
        builderObtain.setIndents(null, null);
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            e.f(builderObtain, i14);
        }
        if (i19 >= 28) {
            m.a(builderObtain);
        }
        if (i19 >= 33) {
            d.d(builderObtain, i16, i17);
        }
        if (i19 >= 35) {
            n.a(builderObtain);
        }
        return builderObtain.build();
    }

    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i10, int i11) {
        int i12 = i10;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i12 - 1, i11, MetricAffectingSpan.class) != i11) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i12 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i12, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i12, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        f.j(textPaint2, charSequence, i12, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i12, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i12 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            f.j(textPaint, charSequence, i12, i11, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i12, i11, rect3);
        return rect3;
    }

    public static final float c(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    public static final int d(Layout layout, int i10, boolean z10) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i10 || lineEnd == i10) {
            if (lineStart == i10) {
                if (z10) {
                    return lineForOffset - 1;
                }
            } else if (!z10) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0266 A[EDGE_INSN: B:145:0x0266->B:172:0x02c2 BREAK  A[LOOP:5: B:155:0x0282->B:207:0x0282]] */
    public static final int e(r rVar, Layout layout, u uVar, int i10, RectF rectF, W0.d dVar, R0 r10, boolean z10) {
        k[] kVarArr;
        int i11;
        int i12;
        k[] kVarArr2;
        int i13;
        int iE;
        int i14;
        int i15;
        int iD;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i16 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i16];
        Layout layout2 = rVar.f8389f;
        int lineStart2 = layout2.getLineStart(i10);
        int iF = rVar.f(i10);
        if (i16 < (iF - lineStart2) * 2) {
            p002a1.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        Q0.g gVar = new Q0.g(rVar);
        boolean z11 = false;
        boolean z12 = layout2.getParagraphDirection(i10) == 1;
        int i17 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z12 && !zIsRtlCharAt) {
                fA = gVar.a(lineStart2, z11, z11, true);
                fA3 = gVar.a(lineStart2 + 1, true, true, true);
            } else if (z12 && zIsRtlCharAt) {
                fA3 = gVar.a(lineStart2, false, false, false);
                fA = gVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = gVar.a(lineStart2, false, false, true);
                    fA = gVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = gVar.a(lineStart2, false, false, false);
                    fA2 = gVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i17] = fA;
            fArr[i17 + 1] = fA3;
            i17 += 2;
            lineStart2++;
            z12 = z12;
            z11 = false;
        }
        Layout layout3 = (Layout) uVar.f1960b;
        int lineStart3 = layout3.getLineStart(i10);
        int lineEnd2 = layout3.getLineEnd(i10);
        int iO = uVar.o(lineStart3, false);
        int iP = uVar.p(iO);
        int i18 = lineStart3 - iP;
        int i19 = lineEnd2 - iP;
        Bidi bidiJ = uVar.j(iO);
        if (bidiJ == null || (bidiCreateLineBidi = bidiJ.createLineBidi(i18, i19)) == null) {
            i11 = 0;
            kVarArr = new k[]{new k(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            kVarArr = new k[runCount];
            int i20 = 0;
            while (i20 < runCount) {
                int i21 = runCount;
                kVarArr[i20] = new k(bidiCreateLineBidi.getRunStart(i20) + lineStart3, bidiCreateLineBidi.getRunLimit(i20) + lineStart3, bidiCreateLineBidi.getRunLevel(i20) % 2 == 1);
                i20++;
                runCount = i21;
            }
            i11 = 0;
        }
        E9.b dVar2 = z10 ? new E9.d(i11, kVarArr.length - 1, 1) : new E9.b(kVarArr.length - 1, i11, -1);
        int i22 = dVar2.f1995r;
        int i23 = dVar2.f1996s;
        int i24 = dVar2.f1997t;
        if ((i24 <= 0 || i22 > i23) && (i24 >= 0 || i23 > i22)) {
            return -1;
        }
        while (true) {
            k kVar = kVarArr[i22];
            boolean z13 = kVar.f8373c;
            int iG = kVar.f8371a;
            int iH = kVar.f8372b;
            float f3 = z13 ? fArr[((iH - 1) - lineStart) * 2] : fArr[(iG - lineStart) * 2];
            float fC = z13 ? c(iG, lineStart, fArr) : c(iH - 1, lineStart, fArr);
            if (z10) {
                float f7 = rectF.left;
                if (fC >= f7) {
                    i12 = i24;
                    float f10 = rectF.right;
                    if (f3 <= f10) {
                        if ((z13 || f7 > f3) && (!z13 || f10 < fC)) {
                            int i25 = iH;
                            int i26 = iG;
                            while (true) {
                                i14 = i25;
                                if (i25 - i26 <= 1) {
                                    break;
                                }
                                int i27 = (i14 + i26) / 2;
                                float f11 = fArr[(i27 - lineStart) * 2];
                                if ((z13 || f11 <= rectF.left) && (!z13 || f11 >= rectF.right)) {
                                    i25 = i14;
                                    i26 = i27;
                                } else {
                                    i25 = i27;
                                }
                            }
                            i15 = z13 ? i14 : i26;
                        } else {
                            i15 = iG;
                        }
                        int iE2 = dVar.e(i15);
                        if (iE2 != -1 && (iD = dVar.d(iE2)) < iH) {
                            if (iD >= iG) {
                                iG = iD;
                            }
                            if (iE2 > iH) {
                                iE2 = iH;
                            }
                            kVarArr2 = kVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iE3 = iE2;
                            while (true) {
                                rectF2.left = z13 ? fArr[((iE3 - 1) - lineStart) * 2] : fArr[(iG - lineStart) * 2];
                                rectF2.right = z13 ? c(iG, lineStart, fArr) : c(iE3 - 1, lineStart, fArr);
                                if (((Boolean) r10.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iG = dVar.g(iG);
                                if (iG != -1 && iG < iH) {
                                    iE3 = dVar.e(iG);
                                    if (iE3 > iH) {
                                        iE3 = iH;
                                    }
                                }
                            }
                        }
                        iG = -1;
                        break;
                    }
                } else {
                    i12 = i24;
                }
                kVarArr2 = kVarArr;
                iG = -1;
                break;
            } else {
                i12 = i24;
                kVarArr2 = kVarArr;
                float f12 = rectF.left;
                if (fC < f12) {
                    iH = -1;
                    break;
                }
                float f13 = rectF.right;
                if (f3 <= f13) {
                    if ((z13 || f13 < fC) && (!z13 || f12 > f3)) {
                        int i28 = iH;
                        int i29 = iG;
                        while (i28 - i29 > 1) {
                            int i30 = (i28 + i29) / 2;
                            float f14 = fArr[(i30 - lineStart) * 2];
                            int i31 = i28;
                            if ((z13 || f14 <= rectF.right) && (!z13 || f14 >= rectF.left)) {
                                i28 = i31;
                                i29 = i30;
                            } else {
                                i28 = i30;
                            }
                        }
                        i13 = z13 ? i28 : i29;
                    } else {
                        i13 = iH - 1;
                    }
                    int iD2 = dVar.d(i13 + 1);
                    if (iD2 == -1 || (iE = dVar.e(iD2)) <= iG) {
                        iH = -1;
                        break;
                    }
                    if (iD2 < iG) {
                        iD2 = iG;
                    }
                    if (iE <= iH) {
                        iH = iE;
                    }
                    RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iD3 = iD2;
                    while (true) {
                        rectF3.left = z13 ? fArr[((iH - 1) - lineStart) * 2] : fArr[(iD3 - lineStart) * 2];
                        rectF3.right = z13 ? c(iD3, lineStart, fArr) : c(iH - 1, lineStart, fArr);
                        if (((Boolean) r10.invoke(rectF3, rectF)).booleanValue()) {
                            break;
                        }
                        iH = dVar.h(iH);
                        if (iH == -1 || iH <= iG) {
                            iH = -1;
                            break;
                        }
                        iD3 = dVar.d(iH);
                        if (iD3 < iG) {
                            iD3 = iG;
                        }
                    }
                } else {
                    iH = -1;
                    break;
                }
                iG = iH;
            }
            if (iG >= 0) {
                return iG;
            }
            if (i22 == i23) {
                return -1;
            }
            i22 += i12;
            i24 = i12;
            kVarArr = kVarArr2;
        }
    }

    public static final boolean f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
