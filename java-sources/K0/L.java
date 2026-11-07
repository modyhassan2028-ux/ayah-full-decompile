package K0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import u.AbstractC1355j;

/* JADX INFO: loaded from: classes.dex */
public final class L implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f4955a = new L();

    public final boolean onClearTranslation(View view) {
        p241y9.a aVar;
        p251z9.j.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        p131n0.c contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f19807w = p131n0.a.f19788r;
        AbstractC1355j abstractC1355jD = contentCaptureManager$ui_release.d();
        Object[] objArr = abstractC1355jD.f22733c;
        long[] jArr = abstractC1355jD.f22731a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        u.E e10 = ((W0) objArr[(i10 << 3) + i12]).f5032a.f7119d.f7108r;
                        Object objG = e10.g(R0.s.f7144B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = e10.g(R0.i.f7094m);
                            R0.a aVar2 = (R0.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = (p241y9.a) aVar2.f7069b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onHideTranslation(View view) {
        p241y9.c cVar;
        p251z9.j.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        p131n0.c contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f19807w = p131n0.a.f19788r;
        AbstractC1355j abstractC1355jD = contentCaptureManager$ui_release.d();
        Object[] objArr = abstractC1355jD.f22733c;
        long[] jArr = abstractC1355jD.f22731a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        u.E e10 = ((W0) objArr[(i10 << 3) + i12]).f5032a.f7119d.f7108r;
                        Object objG = e10.g(R0.s.f7144B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (p251z9.j.a(objG, Boolean.TRUE)) {
                            Object objG2 = e10.g(R0.i.f7093l);
                            R0.a aVar = (R0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (p241y9.c) aVar.f7069b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onShowTranslation(View view) {
        p241y9.c cVar;
        p251z9.j.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        p131n0.c contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f19807w = p131n0.a.f19789s;
        AbstractC1355j abstractC1355jD = contentCaptureManager$ui_release.d();
        Object[] objArr = abstractC1355jD.f22733c;
        long[] jArr = abstractC1355jD.f22731a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        u.E e10 = ((W0) objArr[(i10 << 3) + i12]).f5032a.f7119d.f7108r;
                        Object objG = e10.g(R0.s.f7144B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (p251z9.j.a(objG, Boolean.FALSE)) {
                            Object objG2 = e10.g(R0.i.f7093l);
                            R0.a aVar = (R0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (p241y9.c) aVar.f7069b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
