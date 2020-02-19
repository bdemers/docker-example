
import axios from 'axios';

export class StormtrooperService {

    public list(): Promise<any> {
        return axios.get('/stormtroopers');
    }

    public get(name: string): Promise<any> {
        return axios.get('/stormtroopers/' + name);
    }
}