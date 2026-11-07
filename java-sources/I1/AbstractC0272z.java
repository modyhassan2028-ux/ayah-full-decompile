package I1;

import A.C0007a;
import A.M0;
import H0.InterfaceC0219s;
import K0.c1;
import U0.C0515g;
import Z0.C0710a;
import Z0.C0714e;
import Z0.InterfaceC0716g;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import android.window.BackEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: I1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0272z {
    public static final void a(CursorAnchorInfo.Builder builder, U0.I i10, p171r0.e eVar) {
        if (eVar.e()) {
            return;
        }
        float f3 = eVar.f21390b;
        U0.p pVar = i10.f8024b;
        int iE = pVar.e(f3);
        int iE2 = pVar.e(eVar.f21392d);
        if (iE > iE2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(i10.d(iE), pVar.f(iE), i10.e(iE), pVar.b(iE));
            if (iE == iE2) {
                return;
            } else {
                iE++;
            }
        }
    }

    public static final void b(CursorAnchorInfo.Builder builder, U0.I i10, p171r0.e eVar) {
        if (eVar.e()) {
            return;
        }
        float f3 = eVar.f21390b;
        U0.p pVar = i10.f8024b;
        int iE = pVar.e(f3);
        int iE2 = pVar.e(eVar.f21392d);
        if (iE > iE2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(i10.d(iE), pVar.f(iE), i10.e(iE), pVar.b(iE));
            if (iE == iE2) {
                return;
            } else {
                iE++;
            }
        }
    }

    public static int c(HandwritingGesture handwritingGesture, M0 m10) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        m10.e(new C0710a(fallbackText, 1));
        return 5;
    }

    public static AccessibilityNodeInfo.AccessibilityAction d() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float e(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getAxisVelocity(i10);
    }

    public static void f(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int h(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
    }

    public static int i(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
    }

    public static boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void k(long j, C0515g c0515g, boolean z10, M0 m10) {
        if (z10) {
            int i10 = U0.K.f8034c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c0515g, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c0515g.f8060s.length() ? Character.codePointAt(c0515g, iCharCount2) : 10;
            if (p050e8.b.K(iCodePointBefore) && (p050e8.b.J(iCodePointAt) || p050e8.b.G(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c0515g, iCharCount);
                    }
                } while (p050e8.b.K(iCodePointBefore));
                j = va.g.e(iCharCount, iCharCount2);
            } else if (p050e8.b.K(iCodePointAt) && (p050e8.b.J(iCodePointBefore) || p050e8.b.G(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c0515g.f8060s.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c0515g, iCharCount2);
                    }
                } while (p050e8.b.K(iCodePointAt));
                j = va.g.e(iCharCount, iCharCount2);
            }
        }
        int i11 = (int) (4294967295L & j);
        m10.e(new M.j(new InterfaceC0716g[]{new Z0.x(i11, i11), new C0714e(U0.K.c(j), 0)}));
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0263  */
    public static int l(K.W w9, HandwritingGesture handwritingGesture, O.N n6, c1 c1Var, M0 m10) {
        long jH;
        String string;
        int i10;
        K.t0 t0VarD;
        K.t0 t0VarD2;
        U0.H h7;
        C0515g c0515g = w9.j;
        if (c0515g == null) {
            return 3;
        }
        K.t0 t0VarD3 = w9.d();
        if (!c0515g.equals((t0VarD3 == null || (h7 = t0VarD3.f4794a.f8023a) == null) ? null : h7.f8015a)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jA = p050e8.b.A(w9, p180s0.F.v(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (U0.K.b(jA)) {
                return c(selectGesture, m10);
            }
            m10.e(new Z0.x((int) (jA >> 32), (int) (jA & 4294967295L)));
            if (n6 != null) {
                n6.f(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i11 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jA2 = p050e8.b.A(w9, p180s0.F.v(deleteGesture.getDeletionArea()), i11);
                if (U0.K.b(jA2)) {
                    return c(deleteGesture, m10);
                }
                k(jA2, c0515g, i11 == 1, m10);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i12 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jI = p050e8.b.i(w9, p180s0.F.v(deleteRangeGesture.getDeletionStartArea()), p180s0.F.v(deleteRangeGesture.getDeletionEndArea()), i12);
                    if (U0.K.b(jI)) {
                        return c(deleteRangeGesture, m10);
                    }
                    k(jI, c0515g, i12 == 1, m10);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (c1Var == null) {
                        return c(joinOrSplitGesture, m10);
                    }
                    int iH = p050e8.b.h(w9, p050e8.b.k(joinOrSplitGesture.getJoinOrSplitPoint()), c1Var);
                    if (iH == -1 || ((t0VarD2 = w9.d()) != null && p050e8.b.j(t0VarD2.f4794a, iH))) {
                        return c(joinOrSplitGesture, m10);
                    }
                    int iCharCount = iH;
                    while (iCharCount > 0) {
                        int iCodePointBefore = Character.codePointBefore(c0515g, iCharCount);
                        if (!p050e8.b.J(iCodePointBefore)) {
                            break;
                        }
                        iCharCount -= Character.charCount(iCodePointBefore);
                    }
                    while (iH < c0515g.f8060s.length()) {
                        int iCodePointAt = Character.codePointAt(c0515g, iH);
                        if (!p050e8.b.J(iCodePointAt)) {
                            break;
                        }
                        iH += Character.charCount(iCodePointAt);
                    }
                    long jE = va.g.e(iCharCount, iH);
                    if (!U0.K.b(jE)) {
                        k(jE, c0515g, false, m10);
                        return 1;
                    }
                    int i13 = (int) (jE >> 32);
                    m10.e(new M.j(new InterfaceC0716g[]{new Z0.x(i13, i13), new C0710a(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (c1Var == null) {
                        return c(insertGesture, m10);
                    }
                    int iH2 = p050e8.b.h(w9, p050e8.b.k(insertGesture.getInsertionPoint()), c1Var);
                    if (iH2 == -1 || ((t0VarD = w9.d()) != null && p050e8.b.j(t0VarD.f4794a, iH2))) {
                        return c(insertGesture, m10);
                    }
                    m10.e(new M.j(new InterfaceC0716g[]{new Z0.x(iH2, iH2), new C0710a(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                K.t0 t0VarD4 = w9.d();
                U0.I i14 = t0VarD4 != null ? t0VarD4.f4794a : null;
                long jK = p050e8.b.k(removeSpaceGesture.getStartPoint());
                long jK2 = p050e8.b.k(removeSpaceGesture.getEndPoint());
                InterfaceC0219s interfaceC0219sC = w9.c();
                if (i14 != null) {
                    U0.p pVar = i14.f8024b;
                    if (interfaceC0219sC == null) {
                        jH = U0.K.f8033b;
                    } else {
                        long jA3 = interfaceC0219sC.A(jK);
                        long jA4 = interfaceC0219sC.A(jK2);
                        int iY = p050e8.b.y(pVar, jA3, c1Var);
                        int iY2 = p050e8.b.y(pVar, jA4, c1Var);
                        if (iY != -1) {
                            if (iY2 != -1) {
                                iY = Math.min(iY, iY2);
                            }
                            iY2 = iY;
                        } else if (iY2 == -1) {
                            jH = U0.K.f8033b;
                        }
                        float fB = (pVar.b(iY2) + pVar.f(iY2)) / 2;
                        int i15 = (int) (jA3 >> 32);
                        int i16 = (int) (jA4 >> 32);
                        jH = pVar.h(new p171r0.e(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), fB - 0.1f, Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), fB + 0.1f), 0, U0.G.f8013a);
                    }
                } else {
                    jH = U0.K.f8033b;
                }
                if (U0.K.b(jH)) {
                    return c(removeSpaceGesture, m10);
                }
                p251z9.t tVar = new p251z9.t();
                tVar.f24884r = -1;
                p251z9.t tVar2 = new p251z9.t();
                tVar2.f24884r = -1;
                String str = c0515g.subSequence(U0.K.e(jH), U0.K.d(jH)).f8060s;
                Pattern patternCompile = Pattern.compile("\\s+");
                p251z9.j.d(patternCompile, "compile(...)");
                C0007a c0007a = new C0007a(23, tVar, tVar2);
                p251z9.j.e(str, "input");
                Matcher matcher = patternCompile.matcher(str);
                p251z9.j.d(matcher, "matcher(...)");
                H9.k kVarE = p000a.a.e(matcher, 0, str);
                if (kVarE == null) {
                    string = str.toString();
                } else {
                    int length = str.length();
                    StringBuilder sb = new StringBuilder(length);
                    int i17 = 0;
                    do {
                        sb.append((CharSequence) str, i17, kVarE.a().f1995r);
                        c0007a.e(kVarE);
                        sb.append((CharSequence) "");
                        i17 = kVarE.a().f1996s + 1;
                        kVarE = kVarE.b();
                        if (i17 >= length) {
                            break;
                        }
                    } while (kVarE != null);
                    if (i17 < length) {
                        sb.append((CharSequence) str, i17, length);
                    }
                    string = sb.toString();
                    p251z9.j.d(string, "toString(...)");
                }
                int i18 = tVar.f24884r;
                if (i18 == -1 || (i10 = tVar2.f24884r) == -1) {
                    return c(removeSpaceGesture, m10);
                }
                int i19 = (int) (jH >> 32);
                String strSubstring = string.substring(i18, string.length() - (U0.K.c(jH) - tVar2.f24884r));
                p251z9.j.d(strSubstring, "substring(...)");
                m10.e(new M.j(new InterfaceC0716g[]{new Z0.x(i19 + i18, i19 + i10), new C0710a(strSubstring, 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jI2 = p050e8.b.i(w9, p180s0.F.v(selectRangeGesture.getSelectionStartArea()), p180s0.F.v(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (U0.K.b(jI2)) {
                return c(selectRangeGesture, m10);
            }
            m10.e(new Z0.x((int) (jI2 >> 32), (int) (jI2 & 4294967295L)));
            if (n6 != null) {
                n6.f(true);
            }
        }
        return 1;
    }

    public static boolean m(K.W w9, PreviewableHandwritingGesture previewableHandwritingGesture, O.N n6, CancellationSignal cancellationSignal) {
        U0.H h7;
        C0515g c0515g = w9.j;
        if (c0515g != null) {
            K.t0 t0VarD = w9.d();
            if (c0515g.equals((t0VarD == null || (h7 = t0VarD.f4794a.f8023a) == null) ? null : h7.f8015a)) {
                boolean z10 = previewableHandwritingGesture instanceof SelectGesture;
                K.L l10 = K.L.f4484r;
                if (z10) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (n6 != null) {
                        long jA = p050e8.b.A(w9, p180s0.F.v(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        K.W w10 = n6.f6311d;
                        if (w10 != null) {
                            w10.f(jA);
                        }
                        K.W w11 = n6.f6311d;
                        if (w11 != null) {
                            w11.e(U0.K.f8033b);
                        }
                        if (!U0.K.b(jA)) {
                            n6.q(false);
                            n6.o(l10);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (n6 != null) {
                        long jA2 = p050e8.b.A(w9, p180s0.F.v(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        K.W w12 = n6.f6311d;
                        if (w12 != null) {
                            w12.e(jA2);
                        }
                        K.W w13 = n6.f6311d;
                        if (w13 != null) {
                            w13.f(U0.K.f8033b);
                        }
                        if (!U0.K.b(jA2)) {
                            n6.q(false);
                            n6.o(l10);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (n6 != null) {
                        long jI = p050e8.b.i(w9, p180s0.F.v(selectRangeGesture.getSelectionStartArea()), p180s0.F.v(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        K.W w14 = n6.f6311d;
                        if (w14 != null) {
                            w14.f(jI);
                        }
                        K.W w15 = n6.f6311d;
                        if (w15 != null) {
                            w15.e(U0.K.f8033b);
                        }
                        if (!U0.K.b(jI)) {
                            n6.q(false);
                            n6.o(l10);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (n6 != null) {
                        long jI2 = p050e8.b.i(w9, p180s0.F.v(deleteRangeGesture.getDeletionStartArea()), p180s0.F.v(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        K.W w16 = n6.f6311d;
                        if (w16 != null) {
                            w16.e(jI2);
                        }
                        K.W w17 = n6.f6311d;
                        if (w17 != null) {
                            w17.f(U0.K.f8033b);
                        }
                        if (!U0.K.b(jI2)) {
                            n6.q(false);
                            n6.o(l10);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new M.i(0, n6));
                }
                return true;
            }
        }
        return false;
    }

    public static float n(BackEvent backEvent) {
        p251z9.j.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public static void o(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(p120l9.l.S(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class}));
        editorInfo.setSupportedHandwritingGesturePreviews(p120l9.l.p0(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static void p(TextView textView, int i10, float f3) {
        textView.setLineHeight(i10, f3);
    }

    public static int q(BackEvent backEvent) {
        p251z9.j.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public static float r(BackEvent backEvent) {
        p251z9.j.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public static float s(BackEvent backEvent) {
        p251z9.j.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
