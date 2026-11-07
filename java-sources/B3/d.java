package B3;

import com.ayah.common.data.source.database.BookDatabase;
import com.ayah.common.data.source.json.model.booklist.BookType;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public BookType f603r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public BookDatabase f604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f605t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f606u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f607v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f608w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, q9.c cVar) {
        super(cVar);
        this.f607v = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f606u = obj;
        this.f608w |= Integer.MIN_VALUE;
        return this.f607v.b(null, this);
    }
}
