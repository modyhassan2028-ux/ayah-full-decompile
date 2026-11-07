package A3;

import com.ayah.common.data.source.json.model.Emphasis;
import java.util.ArrayList;
import java.util.List;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f488s;

    public /* synthetic */ b(int i10, int i11) {
        this.f487r = i11;
        this.f488s = i10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) throws Exception {
        E3.c cVar;
        switch (this.f487r) {
            case 0:
                int i10 = this.f488s;
                Q2.a aVar = (Q2.a) obj;
                j.e(aVar, "_connection");
                Q2.c cVarA0 = aVar.a0("SELECT * FROM bookEntry WHERE pageNumber = ?");
                try {
                    cVarA0.c(i10, 1);
                    int iD = Y2.a.D(cVarA0, "id");
                    int iD2 = Y2.a.D(cVarA0, "kind");
                    int iD3 = Y2.a.D(cVarA0, "text");
                    int iD4 = Y2.a.D(cVarA0, "emphases");
                    int iD5 = Y2.a.D(cVarA0, "chapterNumber");
                    int iD6 = Y2.a.D(cVarA0, "pageNumber");
                    int iD7 = Y2.a.D(cVarA0, "verseNumber");
                    int iD8 = Y2.a.D(cVarA0, "verseID");
                    ArrayList arrayList = new ArrayList();
                    while (cVarA0.R()) {
                        int i11 = (int) cVarA0.getLong(iD);
                        String strJ = cVarA0.j(iD2);
                        String strJ2 = cVarA0.j(iD3);
                        String strJ3 = cVarA0.isNull(iD4) ? null : cVarA0.j(iD4);
                        arrayList.add(new E3.a(i11, strJ, strJ2, strJ3 != null ? (List) Emphasis.f13678c.b(strJ3) : null, (int) cVarA0.getLong(iD5), (int) cVarA0.getLong(iD6), cVarA0.isNull(iD7) ? null : Integer.valueOf((int) cVarA0.getLong(iD7)), cVarA0.isNull(iD8) ? null : Integer.valueOf((int) cVarA0.getLong(iD8))));
                        iD = iD;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarA0.close();
                }
            case 1:
                int i12 = this.f488s;
                Q2.a aVar2 = (Q2.a) obj;
                j.e(aVar2, "_connection");
                Q2.c cVarA1 = aVar2.a0("DELETE FROM favorites WHERE ayah_id = ?");
                try {
                    cVarA1.c(i12, 1);
                    cVarA1.R();
                } finally {
                    cVarA1.close();
                }
                break;
            case 2:
                int i13 = this.f488s;
                Q2.a aVar3 = (Q2.a) obj;
                j.e(aVar3, "_connection");
                Q2.c cVarA2 = aVar3.a0("DELETE FROM notes WHERE ayah_id = ?");
                try {
                    cVarA2.c(i13, 1);
                    cVarA2.R();
                } finally {
                    cVarA2.close();
                }
                break;
            default:
                int i14 = this.f488s;
                Q2.a aVar4 = (Q2.a) obj;
                j.e(aVar4, "_connection");
                Q2.c cVarA3 = aVar4.a0("SELECT * FROM notes WHERE ayah_id = ? LIMIT 1");
                try {
                    cVarA3.c(i14, 1);
                    int iD9 = Y2.a.D(cVarA3, "_id");
                    int iD10 = Y2.a.D(cVarA3, "ayah_id");
                    int iD11 = Y2.a.D(cVarA3, "note");
                    int iD12 = Y2.a.D(cVarA3, "timestamp");
                    if (cVarA3.R()) {
                        cVar = new E3.c((int) cVarA3.getLong(iD9), (int) cVarA3.getLong(iD10), cVarA3.getLong(iD12), cVarA3.j(iD11));
                        break;
                    } else {
                        cVar = null;
                    }
                    return cVar;
                } finally {
                    cVarA3.close();
                }
        }
        return y.f19095a;
    }

    public /* synthetic */ b(int i10, c cVar) {
        this.f487r = 0;
        this.f488s = i10;
    }
}
