package T4;

import com.ayah.R;
import java.util.List;
import p120l9.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f7787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f7788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f7789c;

    static {
        f fVar = new f(p095j3.c.f18768t);
        p095j3.c cVar = p095j3.c.f18769u;
        List listS = l.S(new g[]{fVar, new f(cVar), new f(p095j3.c.f18770v)});
        f7787a = listS;
        d dVar = new d(R.string.most_popular, -1);
        p095j3.c cVar2 = p095j3.c.f18761B;
        List listS2 = l.S(new g[]{dVar, new f(cVar2), new d(R.string.khatmah_other, -1), new f(p095j3.c.f18771w), new f(p095j3.c.f18772x), new f(p095j3.c.f18773y), new f(p095j3.c.f18774z), new f(p095j3.c.f18760A), new f(cVar2), new f(p095j3.c.f18762C), new f(p095j3.c.f18763D), new f(p095j3.c.f18764E), new f(p095j3.c.f18765F), new f(p095j3.c.f18766G)});
        f7788b = listS2;
        f7789c = l.S(new g[]{new d(R.string.suggested_khatmah, R.string.suggested_khatmah_description), new f(cVar), new d(R.string.khatmah_other, -1), new e(R.string.divided_by_meanings, "meanings", listS), new e(R.string.divided_by_quarters, "quarters", listS2)});
    }
}
