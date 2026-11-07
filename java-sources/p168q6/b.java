package p168q6;

import E2.AbstractC0115c0;
import E2.F0;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.MainActivity;
import com.ayah.R;
import com.ayah.common.ui.bookmarklist.view.wrapper.BookmarkListWrapper;
import com.ayah.feature.infolist.ui.wrapper.view.SuraQuarterListWrapper;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.ayah.feature.notelist.ui.wrapper.NotesListWrapper;
import com.ayah.feature.starredlist.ui.wrapper.FavoritesListWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0115c0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MainActivity f21312u;

    public b(MainActivity mainActivity) {
        this.f21312u = mainActivity;
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return 5;
    }

    @Override // E2.AbstractC0115c0
    public final long b(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = R.id.index;
        } else if (i10 == 1) {
            i11 = R.id.khatmah;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? R.id.notes : R.id.favorites;
        } else {
            i11 = R.id.bookmarks;
        }
        return i11;
    }

    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        View suraQuarterListWrapper;
        MainActivity mainActivity = this.f21312u;
        if (i10 == 0) {
            suraQuarterListWrapper = new SuraQuarterListWrapper(mainActivity);
        } else if (i10 == 1) {
            suraQuarterListWrapper = new KhatmahWrapper(mainActivity);
        } else if (i10 != 2) {
            suraQuarterListWrapper = i10 != 3 ? new NotesListWrapper(mainActivity) : new FavoritesListWrapper(mainActivity);
        } else {
            suraQuarterListWrapper = new BookmarkListWrapper(mainActivity);
        }
        suraQuarterListWrapper.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new a(suraQuarterListWrapper);
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        return i10;
    }
}
