package K0;

import androidx.compose.ui.viewinterop.AndroidViewHolder;

/* JADX INFO: renamed from: K0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0373v implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f5176s;

    public /* synthetic */ RunnableC0373v(int i10, p241y9.a aVar) {
        this.f5175r = i10;
        this.f5176s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5175r;
        p241y9.a aVar = this.f5176s;
        switch (i10) {
            case 0:
                aVar.invoke();
                break;
            case 1:
                int i11 = AndroidViewHolder.Q;
                aVar.invoke();
                break;
            case 2:
                aVar.invoke();
                break;
            case 3:
                aVar.invoke();
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
