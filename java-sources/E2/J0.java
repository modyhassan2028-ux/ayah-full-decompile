package E2;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1546f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public J0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f1541a = -1;
        this.f1542b = Integer.MIN_VALUE;
        this.f1543c = false;
        this.f1544d = false;
        this.f1545e = false;
        int[] iArr = this.f1546f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
