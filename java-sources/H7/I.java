package H7;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f3452s;

    public /* synthetic */ I(int i10, View view) {
        this.f3451r = i10;
        this.f3452s = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3451r;
        View view = this.f3452s;
        switch (i10) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            case 1:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                int i11 = BottomAppBar.f14616M0;
                view.requestLayout();
                break;
        }
    }
}
