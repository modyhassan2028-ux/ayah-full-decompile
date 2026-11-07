package p020c;

import androidx.activity.ComponentActivity;
import p251z9.j;

/* JADX INFO: renamed from: c.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0778c implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f13370s;

    public /* synthetic */ RunnableC0778c(ComponentActivity componentActivity, int i10) {
        this.f13369r = i10;
        this.f13370s = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13369r;
        ComponentActivity componentActivity = this.f13370s;
        switch (i10) {
            case 0:
                int i11 = ComponentActivity.f11367K;
                componentActivity.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!j.a(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!j.a(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
        }
    }
}
