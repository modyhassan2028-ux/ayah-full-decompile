package D4;

import Z.C0672b;
import Z.C0698o;
import com.ayah.common.data.source.json.model.booklist.BookType;
import java.text.NumberFormat;
import java.util.List;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f1186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1188u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1190w;

    public /* synthetic */ e(C4.e eVar, int i10, p241y9.c cVar, p241y9.a aVar, r rVar, int i11) {
        this.f1185r = 0;
        this.f1188u = eVar;
        this.f1187t = i10;
        this.f1189v = cVar;
        this.f1190w = aVar;
        this.f1186s = rVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1185r) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = C0672b.y(3073);
                k.b((C4.e) this.f1188u, this.f1187t, (p241y9.c) this.f1189v, (p241y9.a) this.f1190w, this.f1186s, (C0698o) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                X4.a.a((String) this.f1188u, (p124m3.j) this.f1189v, this.f1186s, (NumberFormat) this.f1190w, (C0698o) obj, C0672b.y(this.f1187t | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                p067g5.a.b((p079h5.e) this.f1188u, (p241y9.c) this.f1189v, this.f1186s, (r) this.f1190w, (C0698o) obj, C0672b.y(this.f1187t | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                p067g5.a.c((List) this.f1188u, (p241y9.c) this.f1189v, (p241y9.e) this.f1190w, this.f1186s, (C0698o) obj, C0672b.y(this.f1187t | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                p067g5.a.f((BookType) this.f1188u, (p241y9.a) this.f1190w, this.f1186s, (r) this.f1189v, (C0698o) obj, C0672b.y(this.f1187t | 1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ e(BookType bookType, p241y9.a aVar, r rVar, r rVar2, int i10) {
        this.f1185r = 4;
        this.f1188u = bookType;
        this.f1190w = aVar;
        this.f1186s = rVar;
        this.f1189v = rVar2;
        this.f1187t = i10;
    }

    public /* synthetic */ e(Object obj, Object obj2, r rVar, Object obj3, int i10, int i11) {
        this.f1185r = i11;
        this.f1188u = obj;
        this.f1189v = obj2;
        this.f1186s = rVar;
        this.f1190w = obj3;
        this.f1187t = i10;
    }

    public /* synthetic */ e(List list, p241y9.c cVar, p241y9.e eVar, r rVar, int i10) {
        this.f1185r = 3;
        this.f1188u = list;
        this.f1189v = cVar;
        this.f1190w = eVar;
        this.f1186s = rVar;
        this.f1187t = i10;
    }
}
