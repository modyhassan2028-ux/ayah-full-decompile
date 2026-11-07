package p145o4;

import E3.b;
import E3.c;
import com.ayah.dao.backup.Favorite;
import com.ayah.dao.backup.Note;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p120l9.n;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20330a = new a();

    public static ArrayList a(List list) {
        j.e(list, "input");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(n.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(0, ((Favorite) it.next()).f13732a, jCurrentTimeMillis));
        }
        return arrayList;
    }

    public static ArrayList b(List list) {
        j.e(list, "input");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(n.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Note note = (Note) it.next();
            arrayList.add(new c(0, note.f13733a, jCurrentTimeMillis, note.f13734b));
        }
        return arrayList;
    }
}
