package p193t7;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f22626b;

    public /* synthetic */ c(KeyEvent.Callback callback, int i10) {
        this.f22625a = i10;
        this.f22626b = callback;
    }

    @Override // p193t7.a
    public final void b(View view) {
        int i10 = this.f22625a;
    }

    @Override // p193t7.a
    public final void c(int i10, View view) {
        int i11 = this.f22625a;
        KeyEvent.Callback callback = this.f22626b;
        switch (i11) {
            case 0:
                if (i10 == 5) {
                    ((e) callback).cancel();
                }
                break;
            default:
                int i12 = BottomSheetDragHandleView.f14704D;
                ((BottomSheetDragHandleView) callback).e(i10);
                break;
        }
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
