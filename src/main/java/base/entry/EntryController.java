package base.entry;

import base.security.user.CurrentUser;
import base.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @RequestMapping("entries")
    public List<Entry> getAllEntries(){
        return entryService.getAllEntries();
    }

    @RequestMapping("entries/{id}")
    public Entry getEntry(@PathVariable Long id) {
        return entryService.getEntry(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="entries")
    public void addEntry(@RequestBody Entry entry) {
        entryService.addEntry(entry);
    }

    @RequestMapping(method=RequestMethod.PUT, value="entries/{id}")
    public void updateEntry(@PathVariable Long id, @RequestBody Entry entry) {
        entryService.updateEntry(id, entry);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="entries/{id}")
    public void deleteEntry(@PathVariable Long id) {
        entryService.deleteEntry(id);
    }

}
