package Z5;

import android.view.View;
import com.ayah.R;
import com.ayah.feature.tafsir.view.TafsirChapterHeaderView;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f11013v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TafsirChapterHeaderView f11014w;

    public d(View view) {
        super(view);
        this.f11013v = view;
        View viewFindViewById = view.findViewById(R.id.chapter_header_view);
        j.d(viewFindViewById, "findViewById(...)");
        this.f11014w = (TafsirChapterHeaderView) viewFindViewById;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.a(this.f11013v, ((d) obj).f11013v);
    }

    public final int hashCode() {
        return this.f11013v.hashCode();
    }

    @Override // E2.F0
    public final String toString() {
        return "ChapterHeaderViewHolder(view=" + this.f11013v + ")";
    }
}
