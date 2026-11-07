package H2;

import Z.X;
import android.database.SQLException;
import com.ayah.common.ui.bookmarklist.view.wrapper.BookmarkListWrapper;
import p110k9.y;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3254t;

    public /* synthetic */ d(int i10, Object obj, boolean z10) {
        this.f3252r = i10;
        this.f3254t = obj;
        this.f3253s = z10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10 = this.f3252r;
        y yVar = y.f19095a;
        boolean z10 = this.f3253s;
        Object obj = this.f3254t;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                String str = z10 ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                fVar.f3266s.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                fVar.f3265r.d(sb);
                try {
                    u0.F(5, sb.toString());
                    throw null;
                } catch (SQLException e10) {
                    e10.printStackTrace();
                    return yVar;
                }
            default:
                int i11 = BookmarkListWrapper.f13703v;
                ((X) obj).setValue(Boolean.valueOf(!z10));
                return yVar;
        }
    }
}
