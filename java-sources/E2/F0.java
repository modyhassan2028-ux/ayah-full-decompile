package E2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List f1485t = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f1487b;
    public int j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f1501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC0115c0 f1502s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1488c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1489d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1490e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1491f = -1;
    public int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public F0 f1492h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public F0 f1493i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f1494k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f1495l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1496m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u0 f1497n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1498o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1499p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1500q = -1;

    public F0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f1486a = view;
    }

    public final void a(int i10) {
        this.j = i10 | this.j;
    }

    public final int b() {
        RecyclerView recyclerView = this.f1501r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.L(this);
    }

    public final int c() {
        int i10 = this.g;
        return i10 == -1 ? this.f1488c : i10;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.f1494k) == null || arrayList.size() == 0) ? f1485t : this.f1495l;
    }

    public final boolean e() {
        View view = this.f1486a;
        return (view.getParent() == null || view.getParent() == this.f1501r) ? false : true;
    }

    public final boolean f() {
        return (this.j & 1) != 0;
    }

    public final boolean g() {
        return (this.j & 4) != 0;
    }

    public final boolean h() {
        if ((this.j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = I1.S.f3689a;
        return !this.f1486a.hasTransientState();
    }

    public final boolean i() {
        return (this.j & 8) != 0;
    }

    public final boolean j() {
        return this.f1497n != null;
    }

    public final boolean k() {
        return (this.j & 256) != 0;
    }

    public final boolean l() {
        return (this.j & 2) != 0;
    }

    public final void m(int i10, boolean z10) {
        if (this.f1489d == -1) {
            this.f1489d = this.f1488c;
        }
        if (this.g == -1) {
            this.g = this.f1488c;
        }
        if (z10) {
            this.g += i10;
        }
        this.f1488c += i10;
        View view = this.f1486a;
        if (view.getLayoutParams() != null) {
            ((C0137n0) view.getLayoutParams()).f1735c = true;
        }
    }

    public final void n() {
        if (RecyclerView.f12846T0 && k()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.j = 0;
        this.f1488c = -1;
        this.f1489d = -1;
        this.f1490e = -1L;
        this.g = -1;
        this.f1496m = 0;
        this.f1492h = null;
        this.f1493i = null;
        ArrayList arrayList = this.f1494k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f1499p = 0;
        this.f1500q = -1;
        RecyclerView.l(this);
    }

    public final void o(boolean z10) {
        int i10 = this.f1496m;
        int i11 = z10 ? i10 - 1 : i10 + 1;
        this.f1496m = i11;
        if (i11 < 0) {
            this.f1496m = 0;
            if (RecyclerView.f12846T0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i11 == 1) {
            this.j |= 16;
        } else if (z10 && i11 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.f12847U0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
        }
    }

    public final boolean p() {
        return (this.j & 128) != 0;
    }

    public final boolean q() {
        return (this.j & 32) != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1488c + " id=" + this.f1490e + ", oldPos=" + this.f1489d + ", pLpos:" + this.g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f1498o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f1496m + ")");
        }
        if ((this.j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f1486a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
